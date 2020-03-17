package 多线程编程.死锁;
    class lock1 implements Runnable{
        @Override
        public void run() {
            synchronized (死锁实现.l1){
                try {
                    Thread.sleep(1000);
                    System.out.println("我是lock1我获得了第一个锁，我还需要第二个锁。。。。。。。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (死锁实现.l2){
                    System.out.println("获得全部锁，运行结束。。。。。。。");
                }
            }
        }
    }
    class lock2 implements Runnable{
        @Override
        public void run() {
            synchronized (死锁实现.l2){
                try {
                    Thread.sleep(1000);
                    System.out.println("我是lock2我获得了第一个锁，我还需要第二个锁。。。。。。。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (死锁实现.l1){
                    System.out.println("获得全部锁，运行结束。。。。。。。");
                }
            }
        }
    }

public class 死锁实现 {
        static String l1 = "l1";
        static String l2 = "l2";
        public static void main(String[] args) {
            Thread thread1 = new Thread(new lock1());
            Thread thread2 = new Thread(new lock2());
            thread1.start();
            thread2.start();
        }
    }

