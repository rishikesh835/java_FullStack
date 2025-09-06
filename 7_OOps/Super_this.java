 class A{
    A(){
        System.out.println("A's constructor");
    }
    A(int n){
        System.out.println("A's constructor with int: " + n);
    }
}
class B extends A{
    B(){
        super();
        System.out.println("B's constructor");

    }
    B(int n){
        // super(n);
        this(); //executes the constructor of same class

        System.out.println("B's constructor with int: " + n);
    }
}

public class Super_this {
    public static void main(String[] args) {
        B b = new B(5);
        // A a = new A(10);



        A a = new A(6);
        System.out.println(b + " and "+ a);
        System.out.println("End of main method");
    }
}
