package CollegePractical;

class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    @Override
    void sound() {
        System.out.println("Cat makes a sound Meyauuu");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.sound();
    }
}
