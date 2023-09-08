package jour2;

public class BanqueTest {
    private double solde;

    public BanqueTest(double i){
        this.solde = i;
    }
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

}
