package 多线程编程.实现线程的四种方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable接口 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Example3 example3 = new Example3();
        FutureTask futureTask = new FutureTask<>(example3);
        Thread thread = new Thread(futureTask, "线程y");
        thread.start();
        System.out.println(futureTask.get());
    }
}

class Example3 implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("打印第" + i + "个数");
        }
        return "我好想玩耍！";
    }
}