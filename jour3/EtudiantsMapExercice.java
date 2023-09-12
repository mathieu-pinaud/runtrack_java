import java.util.HashMap;
import java.util.Map;

public class EtudiantsMapExercice {
    public static void main(String[] args) {
        Map<Integer, String> etudiants = new HashMap<Integer, String>();

        etudiants.put(103, "Jean");
        etudiants.put(102, "Marc");
        etudiants.put(100, "Jul");
        etudiants.put(104, "Mathieu");

        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
