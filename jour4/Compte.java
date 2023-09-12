public class Compte {
    private double solde;

    Compte(double solde) {
        this.solde = solde;
    }

    public void retrait(double aRetirer) {
        this.solde -= aRetirer;
    }

    public double getSolde() {
        return(this.solde);
    }
}
