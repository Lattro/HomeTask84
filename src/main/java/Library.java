import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Library
{
  private   AtomicInteger  countBooks = new AtomicInteger(100);

    public AtomicInteger getCountBooks()
    {
        return countBooks;
    }
    public void setCountBooks(AtomicInteger countBooks) {
        this.countBooks = countBooks;
    }
}
