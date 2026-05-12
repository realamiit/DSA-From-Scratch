package LearnRecursion.QnaInRecursion;

// Print Name Using Recursion n time also
public class qna01 {
    public static void func(int i , int n) {
        if (i > n) {
            return;
        }
        System.out.println("Hellow Amit!!");
        func(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n+"time 'Hellow Amit!!'using Recursion ");
        func(1, n);
    }
}
