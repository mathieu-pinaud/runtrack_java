import java.util.ArrayList;

public class MotsUniquesExercice {
    ArrayList<String>  maListe = new ArrayList<String>();

    public static void main(String[] args) {
        MotsUniquesExercice liste = new MotsUniquesExercice();
        int i = 0;
        int j = 0;
        boolean isUnique = true;

        while (i < args.length) {
            while (j < args.length) {
                if (args[i].equals(args[j]) && i != j)
                    isUnique = false;
                j += 1;
            }
            if (isUnique)
                liste.maListe.add(args[i]);
            isUnique = true;
            j = 0;
            i += 1;
        }
        i = 0;
        while (i < liste.maListe.size()) {
            System.out.println(liste.maListe.get(i));
            i += 1;
        }
    }
}