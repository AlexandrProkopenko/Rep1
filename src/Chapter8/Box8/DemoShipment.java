package Chapter8.Box8;

/**
 * Created by Александр on 02.08.2017.
 */
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 3, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Обьем shipment1 равен : " + vol);
        System.out.println("Вес shipment1 равен: " + shipment1.weight);
        System.out.println("Стоимость доставки :" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Обьем shipment2 равен : " + vol);
        System.out.println("Вес shipment2 равен: " + shipment2.weight);
        System.out.println("Стоимость доставки :" + shipment2.cost);
        System.out.println();
    }
}
