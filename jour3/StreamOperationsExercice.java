import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class StreamOperationsExercice {
    public static void main(String[] args) {
        List<Integer>  maListe = new ArrayList<>();
        
        for (String arg : args) {
            maListe.add(Integer.parseInt(arg));
        }

        List<Integer> resultat = maListe.stream()
            .map(n -> n * 2)
            .filter(n -> n < 10)
            .collect(Collectors.toList());
        System.out.println(resultat);
    }
}
