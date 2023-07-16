package Day11_CollectionFramework;

import java.util.*;

public class LinkedDataStructures {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        for (int val:set) {
            System.out.println(val+"hashset");
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);

        for (int val:linkedHashSet) {
            System.out.println(val+"linkedhashset");
        }

        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",144);
        map.put("China",142);
        map.put("UK",77);

        for ( Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        for (String key : map.keySet()){
            System.out.println(key);
        }

        for (int value: map.values()){
            System.out.println(value);
        }


        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("India",144);
        linkedHashMap.put("China",142);
        linkedHashMap.put("UK",77);

        for ( String Key: linkedHashMap.keySet()){
            System.out.println(Key);}


    }




}
