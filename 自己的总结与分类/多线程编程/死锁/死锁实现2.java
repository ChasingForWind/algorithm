package 多线程编程.死锁;

public class 死锁实现2 {
    public static void main(String[] args) {
        String l1 = "l1";
        String l2 = "l2";

        new Thread(()->{
            synchronized (l1){
                try {
                    Thread.sleep(1000);
                    System.out.println("我是lock1,我获取了l1锁正在等待l2锁.......");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (l2){
                    System.out.println("我已经获取所有锁，线程结束..........");
                }
            }
        },"thread1").start();

        new Thread(()->{
            synchronized (l2){
                try {
                    Thread.sleep(1000);
                    System.out.println("我是lock2,我获取了l1锁正在等待l2锁.......");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (l1){
                    System.out.println("我已经获取所有锁，线程结束..........");
                }
            }
        },"thread2").start();
        
    }
}
