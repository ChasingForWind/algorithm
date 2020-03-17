package 生产者消费者模式;

/*wait()和notify()方法的实现*/
public class Demo1 {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static String LOCK = "lock";

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Producer producer = demo1.new Producer();
        Consumer consumer = demo1.new Consumer();
        new Thread(producer).start();
        new Thread(consumer).start();
    }
    class Producer implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
                synchronized (LOCK){
                    while (count==FULL){
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()+"生产者生产，目前共有"+count);
                    LOCK.notifyAll();
                }
            }
        }
    }
    class Consumer implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK){
                    while (count==0){
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()+"消费者消费，目前总共有"+count);
                    LOCK.notifyAll();
                }
            }

        }
    }
}
