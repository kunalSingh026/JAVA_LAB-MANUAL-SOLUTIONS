class Bank {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int getInterestRate() {
        return 8;
    }
}

class AXIS extends Bank {
    int getInterestRate() {
        return 6;
    }
}
class BOB extends Bank {
    int getInterestRate() {
        return 7;
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Bank bankReference;
        bankReference = new SBI();
        System.out.println("SBI Interest Rate: " +bankReference.getInterestRate() + "%");

        bankReference = new AXIS();
        System.out.println("AXIS Interest Rate: " +bankReference.getInterestRate() + "%");

        bankReference = new BOB();
        System.out.println("BOB Interest Rate: " +bankReference.getInterestRate() + "%");
        
    }
}