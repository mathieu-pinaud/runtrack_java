public class VoitureExercice {
    private int vitesse;
    private String couleur;
    private String modele;
    public VoitureExercice() {
        this.vitesse = 90;
    }

    public void accelerer() throws VitesseLimiteDepasseeException {
        if (vitesse + 10 >= 110) {
            throw new VitesseLimiteDepasseeException();
        }
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
        VoitureExercice maVoiture = new VoitureExercice();
        maVoiture.demarrer();
        try {
            maVoiture.accelerer();
        } catch (VitesseLimiteDepasseeException e) {
            System.out.println(e.getMessage());
        }
        try {
            maVoiture.accelerer();
        } catch (VitesseLimiteDepasseeException e) {
            System.out.println(e.getMessage());
        }
        maVoiture.freiner();
    }
}
