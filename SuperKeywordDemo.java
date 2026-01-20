class Parent {
    String message = "Hello from Parent Class.";

    void display() {
        System.out.println("Parent Method: This is the original display()");
    }
}

class Child extends Parent {
    String message = "Hello from Child Class.";

    @Override
    void display() {
        System.out.println("Child Method: This is the overridden display().");
    }

    void showDemonstration() {
        System.out.println("---- Variable Access ----");
        System.out.println("Current class message: " + this.message);
        System.out.println("Parent class message: " + super.message);

        System.out.println("\n---- Method Access ----");
        this.display();
        super.display();
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.showDemonstration();
    }
}
