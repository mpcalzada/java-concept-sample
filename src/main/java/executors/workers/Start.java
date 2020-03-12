package executors.workers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * {@link Start}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Start
{
    public static void start() throws InterruptedException
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new InfiniteJob());

        TimeUnit.SECONDS.sleep(5);

        new JobStopper(executorService).stopAll();

        TimeUnit.SECONDS.sleep(5);

        executorService.submit(new InfiniteJob());

        TimeUnit.SECONDS.sleep(5);

        new JobStopper(executorService).stopAll();
    }
}
