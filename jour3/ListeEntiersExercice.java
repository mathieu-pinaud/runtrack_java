import java.util.ArrayList;

public class ListeEntiersExercice {
    ArrayList<Integer>  maListe = new ArrayList<Integer>();

    public static void main(String[] args) {
        ListeEntiersExercice liste = new ListeEntiersExercice();
        int i = 0;
        int res = 0;

        while (i < args.length) {
            liste.maListe.add(Integer.parseInt(args[i]));
            i += 1;
        }
        i = 0;
        while (i < liste.maListe.size()) {
            if (liste.maListe.get(i) % 2 == 0)
                res += liste.maListe.get(i);
            i += 1;
        }
        System.out.println(res);
    }
}
