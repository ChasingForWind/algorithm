package 多线程编程.实现线程的四种方式;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class 线程池 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new Example2());
        pool.submit(new Example2());
        pool.shutdownNow();
    }
}

