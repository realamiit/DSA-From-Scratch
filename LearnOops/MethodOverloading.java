package LearnOops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
//        obj.greeting();
//        obj.greeting("Amit");

        obj.greeting("Amit ", 1000);
    }
}

class Greet{
    public void greeting(){           //public it cant necessary
        System.out.println("Hello, Good Morning");
    }
    void greeting(String name){
        System.out.println("Hello I Am "+name+", Good Morning");
    }

    void greeting(String name,int count){
        for (int i=0;i<count;i++){
            System.out.println("Hello "+name+", Radhe Radhe Hare Krishna ");
        }
    }
}
