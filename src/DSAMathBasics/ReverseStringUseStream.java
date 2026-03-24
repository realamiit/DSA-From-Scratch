package DSAMathBasics;

import java.util.stream.Stream;

public class ReverseStringUseStream {
    public static void main(String[] args) {

        // find the good practice in this case


        String str = "Happy Weekend";

        String reduce = Stream.of(str.split(""))
                .reduce("",
                        (a, b) -> a + b);

        System.out.println(reduce);
    }
}
