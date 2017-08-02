package Box;

/**
 * Created by Александр on 19.05.2017.
 */
public class Box {
    double      width;
    double      height;
    double      depth;

   public Box(Box ob){
    width = ob.width;
    height = ob.height;
    depth = ob. depth;
    }

    public Box(){
       System.out.println("Конструирование объекта box");
       width = -1;
       height = -1;
       depth = -1;
   }

   public Box(double w, double h, double d){
       width = w;
       height = h;
       depth = d;
   }

   public Box(double len){
       width = height = depth = len;
   }

   public void setDim(double w, double h, double d){
      width = w;
      height = h;
      depth = d;

   }

    public double volume(){
      return width*height*depth;
   }
}
