package CollectionFramework;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LearnMaps01 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("India", 1);
        map.put("China", 2);
        map.put("USA", 3);
        map.put("France", 4);

        ArrayList<String> keys = new ArrayList<>(map.keySet());

        ArrayList<String> values = new ArrayList<>();
//        for (String key : keys) {
//            Integer value = map.get(key);
//        }

        System.out.println(values);
        System.out.println(map.containsKey("India"));
    }

}
