package LearnRecursion.QnaInRecursion;

public class qna02 {
    public static void func(int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        func(i - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(n+"time 'Hellow Amit!!'using Recursion ");
        func( n);
    }

}
