import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", ID=" + id + ", GPA=" + gpa + "]";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        String filename ="student_data.ser";
        Student originalStudent = new Student("John Doe", 101, 3.8);

        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(originalStudent);
            objectOut.close();
            fileOut.close();
            System.out.println("Object serialized and saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------");

        Student loadedStudent = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            loadedStudent = (Student) objectIn.readObject();

            objectIn.close();
            fileIn.close();
            System.out.println("Object deserialized successfully!");
            System.out.println("Loaded Data: " + loadedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}