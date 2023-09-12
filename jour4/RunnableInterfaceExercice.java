public class RunnableInterfaceExercice implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En cours d'execution");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {

        RunnableInterfaceExercice test = new RunnableInterfaceExercice();
        Thread thread = new Thread(test);

        thread.run();
    }
    
}
