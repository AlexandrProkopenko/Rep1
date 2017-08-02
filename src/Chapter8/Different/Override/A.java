package Chapter8.Different.Override;

/**
 * Created by Александр on 02.08.2017.
 */
public class A {
    int i, j;
   public A(int a, int b){
        i = a;
        j = b;
    }
    A(){

    }

    void show(){
        System.out.println("i , j: " + i + " " + j);
    }

}
