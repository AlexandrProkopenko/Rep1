package Chapter7;

/**
 * Created by Александр on 12.06.2017.
 */
public class Factorial {
    int fact(int n){
        int result;
        if (n == 1) return 1;
        result = fact(n-1)*n;

        return result;
    }
}

class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("факториал 3 равен " + f.fact(3));
        System.out.println("факториал 4 равен " + f.fact(4));
        System.out.println("факториал 5 равен " + f.fact(5));

    }



}