package 生产者消费者模式;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*使用可重入锁实现*/
public class Demo2 {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    //创建一个锁对象
    private Lock lock = new ReentrantLock();
    //创建两个条件变量，一个为缓冲区非满，一个为缓冲区非空
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        Producer producer = demo2.new Producer();
        Consumer consumer = demo2.new Consumer();
        new Thread(producer).start();
        new Thread(consumer).start();
    }
    class Producer implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while(count==FULL){
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()+"生产者生产，目前共有"+count);
                    notEmpty.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
    class Consumer implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (count==0){
                        try {
                            notEmpty.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()+"消费者正在消费，目前共有"+count);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }

        }
    }
}
