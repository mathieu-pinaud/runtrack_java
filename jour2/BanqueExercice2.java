public class BanqueExercice2 extends BanqueTest2 {
    private double soldeEpargne;
    private double taux;

    public BanqueExercice2(double courant, double epargne, double taux) {
        super(courant);
        this.soldeEpargne = epargne;
        this.taux = taux;
    }

    public void printEpargne(){
        System.out.println("Solde du compte epargne: " + this.soldeEpargne + "avec un taux d'interet de " + this.taux + "%");
        double benefice = this.soldeEpargne / 100 * this.taux;
        this.soldeEpargne += benefice;
        System.out.println("interets ajoutés: " + this.taux + "€. Nouveau solde:" + this.soldeEpargne);
    }

    public static void main(String[] args) {

        double soldeCourant = Double.parseDouble(args[0]);
        double soldeEpargne = Double.parseDouble(args[1]);
        double tauxInteret = Double.parseDouble(args[2]);

        BanqueExercice2 MonCompte = new BanqueExercice2(soldeCourant, soldeEpargne, tauxInteret);
        MonCompte.afficher();
        MonCompte.printEpargne();
        MonCompte.deposer(50);
        MonCompte.retirer(70);
        MonCompte.retirer(90);
    }
}
