import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExercice {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = () -> {
            return(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
        };

        Future<Integer> future = executorService.submit(callable);

        try {
            System.out.println(future.get());
        } catch (Exception e) {}
    
        executorService.shutdown();
    }
}
