package Chapter7;

/**
 * Created by Александр on 01.08.2017.
 */
public class VarArgs3 {
    static void vaTest(int ... v){
        System.out.print("kol-vo arg-tov: " + v.length +
                " Sodergimoe: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();


    }

    static void vaTest(boolean ... v){
        System.out.print("kol-vo arg-tov: " + v.length +
                " Sodergimoe: ");
        for (boolean x: v)
            System.out.print(x + " ");
        System.out.println();

    }

    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String msg, int ... v): " +
                msg + v.length +
                " Sodergimoe: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();

    }


    public static void main(String[] args) {
        vaTest(true, false, false);
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest("sdsds", 12, 22, 2);
    }
}
