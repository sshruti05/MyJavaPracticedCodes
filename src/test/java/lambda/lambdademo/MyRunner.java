package lambda.lambdademo;

public class MyRunner {
    public static void main(String[] args) {
        System.out.println("**************   METHOD 1: Create separate class and implement this interface   *****************");
        MyInterfaceImplementation obj = new MyInterfaceImplementation();
        obj.sayHello(); //Hello Sneha, Hiiiii!!!!!

        System.out.println("**************   METHOD 2: anonymus class for implementing interface   *****************");
        MyInterface i = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("This is Shruti.");
            }
        };
        i.sayHello();

        System.out.println("**************   METHOD 3: Lambda Expression   *****************");
        MyInterface myInterface = () -> System.out.println("Using Lambada expression...");
        myInterface.sayHello();

        SumInterface s = (a, b) -> a+b;
        int result = s.sum(10, 20);
        System.out.println("Sum is: "+ result);

    }
}
