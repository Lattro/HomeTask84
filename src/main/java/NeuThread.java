import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NeuThread extends Thread
{
    int value;
    Lock lock;
    public NeuThread( Lock lock)
    {
        this.lock = lock;
    }
    @Override
    public void run()
    {
        lock.lock();
        for (int i = 0; i < 100; i++)
        {
            value++;
            System.out.println(value);
        }
        lock.unlock();
    }
}
