package Chapter8.Super;

/**
 * Created by Александр on 02.08.2017.
 */
public class B extends A {
    int i;
    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("Член i  в суперклассе :" + super.i);
        System.out.println("Член i  в подрклассе :" + i);
    }
}
