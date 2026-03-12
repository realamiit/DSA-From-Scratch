package CollegePractical;

class StudentCO {
    int id;
    String name;

    StudentCO() {
        id = 0;
        name = "Unknown";
    }

    StudentCO(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        StudentCO s1 = new StudentCO();
        StudentCO s2 = new StudentCO(101, "Amit");

        s1.display();
        s2.display();
    }
}