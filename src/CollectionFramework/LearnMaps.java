package CollectionFramework;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        Map<String,String> map = new HashMap<>();

        map.put("US" , "United States");
        map.put("IND" , "India");
        map.put("JAP" , "Japan");
        map.put("CH" , "China");
        map.put("AU" , "Australia");
        map.putIfAbsent("AUS" , "Australia2"); // in here we can't repeat Id but we can always repeat Key

//        map.remove("AUS");

        System.out.println(map.containsKey("IND"));

        System.out.println(map);

        System.out.println(map.get("IND"));

    }
}
