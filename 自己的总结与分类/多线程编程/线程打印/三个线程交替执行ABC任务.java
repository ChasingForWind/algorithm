package 多线程编程.线程打印;

public class 三个线程交替执行ABC任务 {
    static String lock = "lock";
    static volatile int i =0;

    static class myThread implements Runnable{
        String name;
        int status;
        myThread(String name,int status){
            this.name = name;
            this.status = status;
        }
        @Override
        public void run() {
            while (i<100){
                synchronized (lock){
                    if(i%3==status){
                        System.out.println(this.name);
                        i++;
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
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
    }

    public static void main(String[] args) {
        new Thread(new myThread("A",0)).start();
        new Thread(new myThread("B",1)).start();
        new Thread(new myThread("C",2)).start();
    }
}
