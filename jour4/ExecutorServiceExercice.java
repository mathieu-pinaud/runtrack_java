import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            final int j = i + 1;
            Runnable multiplication = () -> {
                System.out.println(j * Integer.parseInt(args[0]));
            };
        executorService.execute(multiplication);
        }
        executorService.shutdown();
    }
}