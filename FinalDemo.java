final class SecuritySystem {
    void authenticate() {
        System.out.println("System Secure.");
    }
}

class Parent {
    final void displayRules() {
        System.out.println("Parent Rule: Do not change this method.");
    }

    void normalMethod() {
        System.out.println("Parent Normal Method.");
    }
}

class Child extends Parent {
    @Override
    void normalMethod() {
        System.out.println("Child: Overriding the normal method is allowed.");
    }
}

public class FinalDemo {
    static final double PI_VALUE = 3.14159;

    public static void main(String[] args) {
        final int MAX_ATTEMPTS = 5;
        System.out.println("Value of PI: " + PI_VALUE);
        System.out.println("Max Attempts allowed: " + MAX_ATTEMPTS);

        System.out.println("\n--- Method Restriction Test ---");
        Child c = new Child();
        c.displayRules();
        c.normalMethod();

        System.out.println("\n--- Class Restriction Test ----");
        SecuritySystem sec = new SecuritySystem();
        sec.authenticate();
        System.out.println("SecuritySystem class cannot be extended.");
    }
}
