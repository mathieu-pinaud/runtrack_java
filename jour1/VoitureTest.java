public class VoitureTest {
    private int vitesse;
    public VoitureTest() {
        this.vitesse = 0;
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("La vitesse de la voiture est maintenant de " + vitesse + " km/h");
    }

    public void demarrer() {
        System.out.println("La voiture  démarre");
    }

    public void freiner() {
        vitesse = 0;
        System.out.println("La voiture s'arrête. Vitesse réduite à 0 km/h");
    }

    public static void main(String[] args) {
        VoitureTest maVoiture = new VoitureTest();
        maVoiture.demarrer();
        maVoiture.accelerer();
        maVoiture.accelerer();
        maVoiture.freiner();
    }
}