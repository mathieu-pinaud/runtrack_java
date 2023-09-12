import java.util.*;

public class EtudiantTest {
    private List<Double> notes = new ArrayList<>();

    public void setNom() {
        try (Scanner keyb = new Scanner(System.in)) {
            System.out.print("Nom de l'etudiant: ");
            keyb.nextLine();
        }
    }

    public void addNote(double n) {
        this.notes.add(n);
    }

    public void maxNote() {
        System.out.println("Note la plus haute: " + Collections.max(this.notes));
    }

    public void minNote() {
        System.out.println("Note la plus haute: " + Collections.min(this.notes));
    }

    public void moyenne() {
        double res = 0.0;
        for (double note : this.notes) {
            res += note;
        }
        res /= this.notes.size();
        System.out.println("Moyenne: " + res);
    }

    public void printNotes(){
        System.out.print("Notes: [");
        int i = 0;
        while (i < this.notes.size() -1) {
            System.out.print(this.notes.get(i) +", ");
            i +=1;
        }
        System.out.println(this.notes.get(i) + "]");
    }

    public static void main(String[] args) {
        EtudiantTest etu = new EtudiantTest();
        etu.setNom();
        etu.addNote(15);
        etu.addNote(12);
        etu.addNote(18);
        etu.addNote(10);
        etu.printNotes();
        etu.maxNote();
        etu.minNote();
        etu.moyenne();
    }
}