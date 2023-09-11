import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Veuillez saisir votre nom :");
        String prenom = keyb.nextLine();
        String res = "Hello," + prenom + '!';
        System.out.println(res);
        keyb.close();
    }
}