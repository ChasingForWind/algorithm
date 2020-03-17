package 多线程编程.线程打印;

public class 两个线程交替执行AB任务 {
    static String lock = "lock";
    static volatile int i = 0;

    static class A implements Runnable{

        @Override
        public void run() {
            while (i<100){
                synchronized (lock){
                    System.out.println("线程A");
                    lock.notifyAll();
                    i++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class B implements Runnable{

        @Override
        public void run() {
            while (i<100){
                synchronized (lock){
                    System.out.println("线程B");
                    i++;
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
        A a = new A();
        B b = new B();
        new Thread(a).start();
        new Thread(b).start();

    }
}
