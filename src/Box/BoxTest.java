package Box;
import Box.Box;

/**
 * Created by Александр on 19.05.2017.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;



        vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);
        vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);
        vol = mycube.volume();
        System.out.println("Объем равен: " + vol);
        vol = myclone.volume();
        System.out.println("Объем равен: " + vol);

    }
}
