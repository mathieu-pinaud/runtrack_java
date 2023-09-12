public class SynchronizationExercice {
    public static void main(String[] args) {
        Compte compte = new Compte(Double.parseDouble(args[0]));

        Thread thread1 = new Thread(() -> {
            synchronized(compte) {
                compte.retrait(Double.parseDouble(args[1]));
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized(compte) {
                compte.retrait(Double.parseDouble(args[1]));
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {}

        System.out.println("Solde final: " + compte.getSolde());

    }
}
