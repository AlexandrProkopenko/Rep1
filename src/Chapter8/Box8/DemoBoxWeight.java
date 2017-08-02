package Chapter8.Box8;

/**
 * Created by Александр on 02.08.2017.
 */
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 12, 34.4);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.0076);
        BoxWeight box3 = new BoxWeight();
        BoxWeight cube = new BoxWeight(3, 2);
        BoxWeight clone = new BoxWeight(box1);


        double vol;

        vol = box1.volume();
        System.out.println("Обьем бокс1 равен : " + vol);
        System.out.println("Вес бокс1 равен: " + box1.weight);
        System.out.println();

        vol = box2.volume();
        System.out.println("Обьем бокс2 равен : " + vol);
        System.out.println("Вес бокс2 равен: " + box2.weight);
        System.out.println();

        vol = box3.volume();
        System.out.println("Обьем бокс3 равен : " + vol);
        System.out.println("Вес бокс3 равен: " + box3.weight);
        System.out.println();

        vol = cube.volume();
        System.out.println("Обьем cube равен : " + vol);
        System.out.println("Вес cube равен: " + cube.weight);
        System.out.println();

        vol = clone.volume();
        System.out.println("Обьем clone равен : " + vol);
        System.out.println("Вес clone равен: " + clone.weight);
        System.out.println();
    }
}
