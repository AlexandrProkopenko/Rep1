package Chapter7;

/**
 * Created by Александр on 24.05.2017.
 */
 class Test {
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }

    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }

    boolean equals(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb{
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        System.out.println("ob.a & ob.b до вызова: " + ob1.a + " " + ob1.b );
        ob1.meth(ob1);
        System.out.println("ob.a & ob.b после вызова: " + ob1.a + " " + ob1.b );

    }



}
