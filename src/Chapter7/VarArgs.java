package Chapter7;

/**
 * Created by Александр on 01.08.2017.
 */
public class VarArgs {
    static void vaTest(int ... v){
        System.out.print("kol-vo arg-tov: " + v.length +
                " Sodergimoe: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();


    }

    public static void main(String[] args) {
        vaTest();
        vaTest(10);
        vaTest(1, 2, 3);
    }
}
