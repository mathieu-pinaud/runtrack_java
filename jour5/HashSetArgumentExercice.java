import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(args));
        for (String mot : hashSet)
            System.out.println(mot);
    }
}
