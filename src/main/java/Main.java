import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        // TASK - 2
        Lock lock = new ReentrantLock();
        NeuThread thread = new NeuThread(lock);
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
        Thread.sleep(2000);

        // TASK - 3
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        Library library = new Library();
        for (int i = 0; i < 60 ; i++)
        {
            executorService.submit(new People("men"+i,library));
        }
        executorService.shutdown();
    }
}
