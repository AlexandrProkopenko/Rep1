package Chapter8.Box8;

import Box.Box;

/**
 * Created by Александр on 02.08.2017.
 */
 class BoxWeight extends Box {
     double weight;

     BoxWeight(BoxWeight ob){
         super(ob);
         weight = ob.weight;
     }

     BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
     }

     BoxWeight(){
         super();
         weight = -1;
     }

     BoxWeight(double len, double m){
         super(len);
         weight = m;
     }

}
