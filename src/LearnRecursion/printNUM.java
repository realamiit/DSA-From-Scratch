package LearnRecursion;

public class printNUM {

        public static void Printnum(int n){

        if(n==1){
            System.out.println(1);
            return;
        }

        Printnum(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Printnum(5);
    }

}

// java LearnRecursion.printNUM   : run in terminal by this command
