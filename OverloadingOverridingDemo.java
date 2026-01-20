class Parent {

    void add(int a, int b) {
        System.out.println("The Sum of a and b is: "+ (a+b));
    }

    void add(double a, double b) {
        System.out.println("The Sum of a and b is: "+(a+b));
    }
    void display() {
        System.out.println("Parent Class: This is the original display method.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child Class: This is the duplicate display method.");
    }
}

public class OverloadingOverridingDemo {
    public static void main(String[] args) {
        Parent Dad = new Parent();
        System.out.println("-----Demonstrating Overloading------");
        Dad.add(3, 5);
        Dad.add(3.5, 5.5);

        Child c = new Child();
        c.display();
        c.add(100, 200);
    }
}