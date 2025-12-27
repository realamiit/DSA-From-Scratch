package LearnString;

import java.util.Scanner;

public class learnstring {
    public static void main(String[] args) {

//        String name = "     Krishnaradha     ";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.length());
//        System.out.println(name.trim());
//        System.out.println(name.replace("radha", "Krishna"));
//
//        System.out.println("Amit".startsWith("Ami"));
//        System.out.println("Amit".equals("Amit"));
//        System.out.println("Amit".equalsIgnoreCase("Ami"));
//        System.out.println("AmitGupta".charAt(4));
//        System.out.println("AmitGupta".toLowerCase());
//
//        int age = 23;
//        String StringAge = String.valueOf(age);
//        System.out.println(age*2);  //46
//        System.out.println(StringAge+2);  //232


//        String sentence = "i Love java, java is a good , programming languange";
            //  .substring()
//        String substring = sentence.substring(2);
//        System.out.println(substring);
//
        //  .split()
//        String words[] = sentence.split("a");
//        for (String word : words) {
//            System.out.println(word);
//        }

             // .toCharArray
        String color = "Brown is my fav color";
        char letters[] = color.toCharArray();
        for (char letter: letters){
            System.out.println(letter);
        }

        // .isEmpty(), .isBlank()
        String Animal = "Amit ";
        if (Animal.isEmpty()){
            System.out.println("Empty");
        }else if(Animal.isBlank()){
            System.out.println("Blank");
        }




//        String newSentence = sentence.replace("java","cpp");
//        System.out.println(sentence);
//        System.out.println(newSentence);
//
//        System.out.println(sentence.equals(newSentence));
//
//        System.out.println(sentence.contains("java"));


//        Scanner sc = new Scanner(System.in);
//        System.out.prpumpln("Enter your first name");
//
//        String firstName = sc.nextLine();
//        System.out.println("Enter your last name");
//        String lastName = sc.nextLine();
//
//        System.out.println("your full name is:" + firstName + " " + lastName);
    }
}