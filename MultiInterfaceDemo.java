interface Printable {
    void print();
}

interface Showable {
    void print();
}
class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Resolution: This single print() method satisfies both interfaces.");
    }
    void specificMethod() {
        System.out.println("This is a normal method of Document class. ");
    }
}
public class MultiInterfaceDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        Printable p = doc;
        p.print();
        Showable s = doc;
        s.print();
    }
}
