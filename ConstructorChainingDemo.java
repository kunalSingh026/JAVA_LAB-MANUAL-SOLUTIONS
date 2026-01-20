class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("1. Parent Constructor Called!");
    }
}

class Student extends Person {
    int rollNumber;
    Student() {
        this("Unknown Student", 0);
        System.out.println("3. Student Default Constructor Called!");
    }

    Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
        System.out.println("2. Student Parameterized Constructor Called!");
    }

    void display () 
    {
        System.out.println("\n---- Student Details ----");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNumber);
    }

}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        System.out.println("---- Creating object with Default Constructor ----");
        Student s1 = new Student();
        s1.display();
        System.out.println("\n---- Creating object with Parametrerized Constructor ----");
        Student s2 = new Student("Alice", 101);
        s2.display();
    }
}
