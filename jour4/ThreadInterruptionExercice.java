public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        //create a thread that sleep for the given time but is interrupted half way
        Thread thread = new Thread(() -> {
 
                try {
                    Thread.sleep(1000 * Integer.parseInt(args[0]));
                } catch (InterruptedException e) {}                
        });
        thread.start();
        try {
            Thread.sleep(Integer.parseInt(args[0]) / 2 * 1000);
            thread.interrupt();
        } catch (InterruptedException e) {}
        System.out.println(10 * 20 + "Hello" + 30 / 40);
    }
}
