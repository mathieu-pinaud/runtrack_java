package jour2;

public class DivisionExercice {

    public double diviser(double i, double j) throws DivisionParZeroException {
        if (j == 0) {
            throw new DivisionParZeroException();
        }
        return (i / j);
    }
    public static void main(String[] args) throws DivisionParZeroException {
        double i = Double.parseDouble(args[0]);
        double j = Double.parseDouble(args[1]);
        double res;
        DivisionExercice exercice = new DivisionExercice();

        try {
            res = exercice.diviser(i, j);
            System.out.println(res);
        } catch (DivisionParZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
