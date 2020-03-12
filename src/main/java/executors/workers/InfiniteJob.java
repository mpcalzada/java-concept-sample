package executors.workers;

/**
 * {@link InfiniteJob}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class InfiniteJob implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println("Hello, I am the infinite task.");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Ooops, something went wrong in InfiniteJob");
        }
    }
}
