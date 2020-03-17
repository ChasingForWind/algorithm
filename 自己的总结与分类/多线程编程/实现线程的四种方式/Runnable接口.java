package 多线程编程.实现线程的四种方式;

public class Runnable接口 {
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        Thread thread = new Thread(example2, "线程x");
        thread.start();
    }
}
class Example2 implements Runnable{

    @Override
    public void  run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在打印第"+i+"个数");
        }
    }
}
