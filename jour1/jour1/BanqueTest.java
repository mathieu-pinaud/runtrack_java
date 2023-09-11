package jour1;

public class BanqueTest {
    private double solde = 100;

    public void afficher(){
        System.out.println("Solde actuel: " + this.solde);
    }

    public void deposer(int i) {
        this.solde += i;
        System.out.println(i + "€ déposés. Nouveau solde: " + this.solde + "€.");
    }
    public void retirer(int i) {
        if (this.solde - i >= 0) {
            this.solde -= i;
            System.out.println(i + "€ retirés. Nouveau solde: " + this.solde + "€.");
        } else {
            System.out.println("Tentative de retrait de " + i + "€... Solde insuffisant!");
        }
    }

    public static void main(String[] args) {
        BanqueTest MonCompte = new BanqueTest();
        MonCompte.afficher();
        MonCompte.deposer(50);
        MonCompte.retirer(70);
        MonCompte.retirer(90);
    }
}
