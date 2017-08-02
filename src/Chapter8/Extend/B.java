package Chapter8.Extend;

/**
 * Created by Александр on 02.08.2017.
 */
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}