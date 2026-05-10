package CollectionFramework;

public class Animal {

    int age;
    String name;
    String color;

//    Animal(int age, String name, String color) {
//        this.age = age;
//    }


    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}

