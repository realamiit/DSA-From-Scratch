package CollectionFramework;

import com.sun.jdi.Value;

import java.util.*;
import java.util.LinkedHashMap;

public class LearnMaps01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 1);
        map.put("China", 2);
        map.put("USA", 3);
        map.put("France", 4);

        ArrayList<String> keys = new ArrayList<>(map.keySet());

        Collection<Integer> values = map.values();

        System.out.println(values);

        System.out.println(keys);

        System.out.println(map.containsKey("India"));

        System.out.println(map.containsValue("USA"));
    }

}
