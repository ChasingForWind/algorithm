
package 多线程编程.实现线程的四种方式;

public class Thread类 {
    public static void main(String[] args) {
        Example example = new Example();
        example.start();
    }
}
class Example extends Thread{
    @Override
    public void  run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("打印第"+i+"个数");
        }
    }
}
