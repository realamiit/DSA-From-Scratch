package LearnOops;

public class LearnConstructors {
    public static void main(String[] args) {
        Complex num1 = new Complex(5 , 8);
        Complex num2 = new Complex(7, 8);
        num1.print();
        num1.print();


    }
}

class Complex{
    int a, b;


    public Complex(int real,int imaginary){
        int c = real;
        int d = imaginary;
    }

    void print(){
        System.out.println(a+" + " + b + "i");
    }
}

