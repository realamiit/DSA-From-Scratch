package LearnOops;

public class classes {
    public static void main(String[] args) {

//        Dog d1 = new Dog();
//        d1.name="Tommy";
//        d1.bark();
//
//        Dog d2 = new Dog();
//        d2.name="leo";
//        d2.walking();
//********************************************    for learn constructor
//        Complex num1 = new Complex();
//        num1.a=4;
//        num1.b=6;
//        num1.print();
//        Complex num2 = new Complex();
//        num2.a=9;
//        num2.b=0;
//        num2.print();
//    }
//}
//class Complex{
//    int a,b;
//    void print(){
//        System.out.println(a+"+"+b+"i");
        }
}
//****************
class Dog {
    String name;
    String color;
    int age;
    String gender;

    void walking(){
        System.out.println(name+"walking");
    }
    void bark(){
        System.out.println(name + "is barking in the garden");
    }
}