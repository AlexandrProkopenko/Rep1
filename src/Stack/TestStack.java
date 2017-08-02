package Stack;

import Stack.Stack;

/**
 * Created by Александр on 24.05.2017.
 */
public class TestStack {

    public static void main(String[] args) {
        Stack st1 = new Stack(5);
        Stack st2 = new Stack(8);
        for (int i = 0; i <5; i++) {
            st1.push(i);
        }
        for (int i = 0; i <8; i++) {
            st2.push(i);
        }

        System.out.println("Содержимое стека1:");
        for (int i = 0; i <5; i++) {
            System.out.println(st1.pop());
        }


        System.out.println("Содержимое стека2:");
        for (int i = 0; i <8; i++) {
            System.out.println(st2.pop());
        }

    }
}
