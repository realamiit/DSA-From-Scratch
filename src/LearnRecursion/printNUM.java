package LearnRecursion;

public class printNUM {

    public static void Printnum(int n) {

        if (n == 1) {
            System.out.println(1);
            return;   // it means in this function this return; 
        }

        Printnum(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Printnum(5);
    }

}

// java LearnRecursion.printNUM : run in terminal by this command

// Base condations : the condition whwere we have to no more  gone call it and stop the function thats call is known as base condition
