import java.util.HashMap;
import java.util.HashSet;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        int i = 0;
        int j = 1;

        while (i < args.length - 1){
            hashMap.put(args[i], args[j]);
            i += 2;
            j += 2;
        }
        System.out.println(hashMap);
    }
}
