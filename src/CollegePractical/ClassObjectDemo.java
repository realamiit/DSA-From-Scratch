package CollegePractical;

class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {

        Student s1 = new Student();   // creating object

        s1.id = 101;
        s1.name = "Amit";

        s1.display();   // calling method
    }
}
