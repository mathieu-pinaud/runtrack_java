import java.util.Optional;

public class OptionalExercice {

    public String trouverlongueur(Optional<String> mot) {
        if (mot.isPresent()) {
            System.out.println(mot.get().length());
            return mot.get();
        } else {
            return ("Chaine non fournie");
    }

    }
    public static void main(String[] args) {
        OptionalExercice test = new OptionalExercice();

        test.trouverlongueur(Optional.of(args[0]));
    }
}
