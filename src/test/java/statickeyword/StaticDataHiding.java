package statickeyword;

class A{
    static void display(){
        System.out.println("A's static display");
    }
}
class B extends A{
    static void display(){
        System.out.println("B's static display");
    }
}
class C{
    void display(){
        System.out.println("C's class display");
    }
}
class D extends C{
    void display(){
        System.out.println("D's class display");
    }
}

public class StaticDataHiding {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        B b = new B();
        a.display(); //A's static display
        a1.display();//A's static display
        b.display(); //B's static display

        C c = new C();
        C c1 = new D();
        D d = new D();
        c.display(); //C's class display
        c1.display();//D's class display
        d.display(); //D's class display
    }
}
