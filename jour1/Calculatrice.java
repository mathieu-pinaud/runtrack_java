import java.util.Scanner;

public class Calculatrice {
    public int addition(int i, int j) {
        return (i + j);
    }

    public int soustraction(int i, int j) {
        return (i - j);
    }
    public int multiplication(int i, int j) {
        return (i * j);
    }
    public int division(int i, int j) {
        return (i / j);
    }

    public static void main(String[] args) {
        Calculatrice MaCalculatrice = new Calculatrice();
        try (Scanner keyb = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre: ");
            int  i = keyb.nextInt();
            System.out.print("Entrez le deuxieme nombre: ");
            int  j = keyb.nextInt();
            System.out.println("Somme: " + MaCalculatrice.addition(i, j));
            System.out.println("Difference: " + MaCalculatrice.soustraction(i, j));
            System.out.println("Produit: " + MaCalculatrice.multiplication(i, j));
            System.out.println("Division: " + MaCalculatrice.division(i, j));
        }
    }

}
