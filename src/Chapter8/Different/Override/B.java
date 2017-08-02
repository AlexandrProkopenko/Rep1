package Chapter8.Different.Override;

/**
 * Created by Александр on 02.08.2017.
 */
public class B extends A {
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    void show(String msg){
//        super.show();
        System.out.println(msg +  k);
    }
}
