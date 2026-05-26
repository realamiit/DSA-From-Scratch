package DSAMathBasics;

public class gcd {
    public static int main(int n1,  int n2){
     

     for(int i= (n1,n2) ; i>= 1; i--){

        if(n1 % i ==0 && n2 % i ==0){
            System.out.println(i);
        }break;

     }
    }

}

// The GCD of two numbers is the largest number that divides both of them without leaving a remainder. 
// We iterate through all numbers from 1 up to the minimum of the two input numbers, checking if each number is a common factor of both input numbers.
// if we find two num and the  20,40 the factor is 20 cause the higest comon factor in this question is 20 because this output is bigger than fommon is 20

