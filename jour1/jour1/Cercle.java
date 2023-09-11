package jour1;

public class Cercle {
    int rayon;

    public Cercle(int r) {
        this.rayon = r;
    }

    public void Aire() {
        double aire = Math.PI * this.rayon * this.rayon;
        System.out.println("Aire du cercle de rayon " + this.rayon + ": " + aire);
    }
}
