import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistArgumentExercice {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(args));
        for (String mot : arrayList) {
            System.out.println(mot);
        }
    }
}
