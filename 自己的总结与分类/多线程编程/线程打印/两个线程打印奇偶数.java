package 多线程编程.线程打印;

public class 两个线程打印奇偶数 {
    public static volatile  int i = 0;
    public static final int total = 100;
    public static String lock = "lock";
    //打印奇数线程
    static class printEven implements Runnable{
        @Override
        public void run() {
            while (i<100) {
                synchronized (lock) {
                    if (i % 2 == 1) {
                        System.out.println("奇数" + i);
                        i++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    //打印偶数线程
    static class printOdd implements Runnable{

        @Override
        public void run() {
            while (i<100) {
                synchronized (lock) {
                    if (i % 2 == 0) {
                        System.out.println("偶数" + i);
                        i++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        printEven printEven = new printEven();
        printOdd printOdd = new printOdd();
        new Thread(printEven).start();
        new Thread(printOdd).start();
    }
}
