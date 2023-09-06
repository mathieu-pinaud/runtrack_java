public class Carre {
    int cote;

    public Carre(int c) {
        this.cote = c;
    }

    public void Aire() {
        double aire = this.cote * this.cote;
        System.out.println("Aire du carré de coté " + this.cote + ": " + aire);
    }
}
