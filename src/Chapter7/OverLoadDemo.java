package Chapter7;

/**
 * Created by Александр on 24.05.2017.
 */
public class OverLoadDemo {
    void test(){
        System.out.println("Параметры отсутствуют");
    }
//    void test(int a){
//        System.out.println("a: " + a);
//    }
    void test(int a, int b){
        System.out.println("a & b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("Внутреннее преобразование при вызове test(double a) a: " + a);

    }
}

class Overload{
    public static void main(String[] args) {
        OverLoadDemo od = new OverLoadDemo();
        int i = 88;

        od.test();
        od.test(10);
        od.test(10, 20);
        od.test(i);
        od.test(123.25);
//        System.out.println("Результата вызова od.test(123.25) " + res);
    }


}
