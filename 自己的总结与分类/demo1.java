import java.util.Arrays;
import java.util.concurrent.*;

public class demo1 {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,
                4,
                2000,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        ExecutorService executorService = Executors.newFixedThreadPool(2);


    }
}
