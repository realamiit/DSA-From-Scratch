package LearnRecursion;

public class PrintNUM {
    
    public static void Printnum(int n){

    if(n==1){
        System.out.println(1);
        return; // if the condition is true than return mtlb over 
    }

    Printnum(n-1);
    System.out.println(n);
}
}
