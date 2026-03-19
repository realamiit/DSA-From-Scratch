package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnComparableAndComparetor {
    public static void main(String[] args) {
        Animal a1 = new Animal (2, "Mili","brown");
        Animal a2 = new Animal (1, "Jojo","brown");
        Animal a3 = new Animal (3, "Boo","brown");
        Animal a4 = new Animal (4, "Meyocoo","brown");

        List<Animal> cats = new ArrayList<>();

        cats.add(a1);
        cats.add(a2);
        cats.add(a3);
        cats.add(a4);

        System.out.println(cats);

    }
}
