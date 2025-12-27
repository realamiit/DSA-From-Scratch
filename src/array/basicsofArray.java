package array;

public class basicsofArray {
    public static void main(String[] args) {

        //in multi line
//        int age[];   //declaration
//        age = new int[5];  //allocation


//        int age[] = new int[9];  //single line
//
//        age[0] = 1;
//        age[1] = 2;
//        age[3] = 8;
//        age[4] = 18;
//        age[2] = 19;
//        age[7] = 22;
//        System.out.println(age[7]);
//        System.out.println(age[8]);
//        System.out.println(age[3]);
//        System.out.println(age[0]);
//
//        System.out.println(age.length); //to fiend array length


//        int marks[] ={34,30,33,38,26,39};
//        System.out.println(marks[5]);

        String names[] = {"Amit", "Saloni", "Karishma", "Riya", "Vivek", "Ayush"};
//        for (int i = 0; i < names.length; i++);
//        {
//            System.out.println("Name is:" + names[0]);
//        }
        for (String name : names) {
            System.out.println("Name is:" + name);
        }


    }
}
