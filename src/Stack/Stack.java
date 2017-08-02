package Stack;

/**
 * Created by Александр on 19.05.2017.
 */
public class Stack {

   private int[] stck;
   private int tos;

    public Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    public void push(int item){
        if (tos == stck.length - 1)
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    public int pop(){
        if (tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }

}
