package Chapter7;

/**
 * Created by Александр on 01.08.2017.
 */
public class Access {
    int a;
    public int b;
    private int c;

    void setc(int i){
        c = i;
    }

    int getc() {
        return c;
    }

}
class TestAccess{

    public static void main(String[] args) {
        Access ac = new Access();
        ac.a = 10;
        ac.b = 20;
//        ac.c = 100;
        ac.setc(10);
        System.out.println("a, b ,c: " + ac.a + " " + ac.b + " " +ac.getc());
    }
}
