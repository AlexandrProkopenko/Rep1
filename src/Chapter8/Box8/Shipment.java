package Chapter8.Box8;

/**
 * Created by Александр on 02.08.2017.
 */
public class Shipment extends BoxWeight {
    double cost;
    Shipment (Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
