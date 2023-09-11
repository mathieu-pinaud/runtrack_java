package jour1;

import java.util.Random;

public class JeuDeDes {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(1, 7);
        System.out.println("De 1: " + i);
        int j = rand.nextInt(1, 7);
        System.out.println("De 2: " + j);
        i += j;
        System.out.println("Somme: " + i);
    }
}
