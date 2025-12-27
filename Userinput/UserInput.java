package Userinput;
import java.util.Scanner;

public class UserInput {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your Age");
//        int age = sc.nextInt();
//        System.out.println("Your age: " + age);
//    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter no");
//        int a =sc.nextInt();
//        int b =sc.nextInt();
//        System.out.println("your no is"+a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = sc.nextLine();
        System.out.println("Enter your Password");
        String password = sc.nextLine();
        System.out.println("Enter your Confirm Password");
        String confirmPassword = sc.nextLine();
        System.out.println("Enter your email");
        String email = sc.nextLine();
        System.out.println("Enter your instagramUserName");
        String InstagramUserName = sc.nextLine();
        System.out.println("Enter your instagramPassword");
        String InstagramPassword = sc.nextLine();
        System.out.println("Enter your instagramEmail");
        String InstagramEmail = sc.nextLine();
        System.out.println("your done : "+ userName + "\n" + password + "\n " + confirmPassword +"\n" + email + "\n"+ InstagramUserName +"\n"+InstagramPassword+"\n"+ InstagramUserName +"\n"+InstagramEmail+"\n"+ InstagramUserName +"\n");


    }
}
