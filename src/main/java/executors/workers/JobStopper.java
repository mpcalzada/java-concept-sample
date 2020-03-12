package executors.workers;

import lombok.AllArgsConstructor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * {@link JobStopper}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
@AllArgsConstructor
public class JobStopper
{
    private ExecutorService executorService;

    public void stopAll()
    {
        System.out.println("Stopping the executor service.");
        executorService.shutdown();
        try
        {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS))
            {
                executorService.shutdownNow();
            }
        }
        catch (InterruptedException e)
        {
            executorService.shutdownNow();
        }
    }
}
