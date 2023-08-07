import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class People implements Runnable
{
    private String name;
    Library library;
    public People(String name, Library library) {
        this.name = name;
        this.library= library;
    }

    @Override
    public void run()
    {
        System.out.println(name+" берет три книги и читает");
        for (int i = 0; i < 3; i++)
        {
           library.getCountBooks().decrementAndGet();
        }
        System.out.println("("+name+")"+ " Книг осталось - "+ library.getCountBooks());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" возвращает три книги и уходит");
        for (int i = 0; i < 3; i++)
        {
            library.getCountBooks().incrementAndGet();
        }
        System.out.println("("+name+")"+ "Книг осталось - "+ library.getCountBooks());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
