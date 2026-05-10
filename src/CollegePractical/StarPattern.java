package CollegePractical;

public class StarPattern {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--){
            for(int j = i; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
