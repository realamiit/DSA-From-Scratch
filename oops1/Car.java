package oops1;

public class Car extends Vehicle {
//    static void main() {
//        Car obj = new Car();
//        obj.wheelsCount =4;
//        obj.color = "red";
//        obj.color = "green";
//        obj.color = "blue";
//        obj.start();
//        obj.stop();
//        obj.model = "I12";

//    }

    void start(){
        System.out.println(this);
        System.out.println("Car starting");
    }

    public static void main(String[] args) {
        Car car = new Car();

    }

}
