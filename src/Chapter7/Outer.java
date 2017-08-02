package Chapter7;

/**
 * Created by Александр on 01.08.2017.
 */
public class Outer {
    int outer_x = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();

    }
    class Inner{
        int y = 10;
        void display(){
            System.out.println("outer_x = " + outer_x);
        }
    }

}

class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}