package Chapter8.Extend;

/**
 * Created by Александр on 02.08.2017.
 */
class SimpleInheritance{
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое суперобджект: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое сабобджект: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Сумма: ");
        subOb.sum();

    }
}
