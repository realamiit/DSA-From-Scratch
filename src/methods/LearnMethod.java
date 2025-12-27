package methods;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class LearnMethod {
    public static void main(String[] args) {
        System.out.println("im the first");
        System.out.println("im the second");
        System.out.println("im the third ");
        greet();
        System.out.println("im here ");
        System.out.println("im here again");
        System.out.println("im here again an again");



//        average(a:4,b:6);
//        System.out.println("im the average");
//        average(a:2, b:7);
      }

    static void greet(){
        System.out.println(5);
        System.out.println("im here to give output also");
        System.out.println(6);
    }

    public static void average(int a, int b){
        int avg = (a+b)/2;
        System.out.println("im the average is "+avg);
    }


        static int minimum(int a,int b) {

            if (a < b) return a;
            return 0;
        }

}
