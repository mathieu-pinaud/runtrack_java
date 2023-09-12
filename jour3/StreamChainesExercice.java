import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    public static void main(String[] args) {
        List<String> maListe = Arrays.asList(args).stream()
            .filter(s -> s.length() <= 3)
            .filter(s -> s.charAt(0) == 'a')
            .collect(Collectors.toList());
        System.out.println(maListe);
    }
}
