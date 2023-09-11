package jour1;

import jour1.Carre;
import jour1.Cercle;

public class FormesTest {

    public static void main(String[] args) {
        Cercle monCercle = new Cercle(5);
        Carre monCarre = new Carre(4);
        monCercle.Aire();
        monCarre.Aire();
    }
}

