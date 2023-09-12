public class GeneriqueExercice {
    public static void main(String[] args) {
        if (args[0].equals("string")) {
            Boite<String> boite = new Boite<String>(args[1]);
            System.out.println(boite.getValue());
        }
        else if (args[0].equals("int")) {
            Boite<Integer> boite = new Boite<Integer>(Integer.parseInt(args[1]));
            System.out.println(boite.getValue());
        }
        else {
            System.out.println("j'ai pas prévu ce cas là");
        }
    }
}
