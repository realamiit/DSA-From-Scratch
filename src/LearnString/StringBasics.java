package LearnString;

import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args) {
      String name = "Amit";
      String sameName ="Amit gupta";
      String newName = new String("Amit");
        System.out.println(name);
        System.out.println(newName);
        System.out.println(sameName);

        System.out.println("amit Gupta");
        System.out.println(newName.equals(name));

        if(name == sameName){
            System.out.println("your mane is true (right)");
        } else {
            System.out.println("your mane is not true (right)");
        }
        if(name == newName){
            System.out.println("Both are same");
        }

    }
}
