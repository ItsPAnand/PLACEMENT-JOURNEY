package Collection_in_Java;

import java.util.*;

public class hash_Map{
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("20D105","Anand");
        map.put("20D130", "SharathKumar");
        map.put("20D104", "Akilesh");
        map.put("20D124", "SakthiVel");
        map.put("20D135", "Vasanth");
        map.put("20D105", "Anand");
        System.out.println(map.get("20D105"));
        map.put("20D105", "Hello");
        // for(String str:map.keySet()){
        //     System.out.println(str);
        // }
        // for(String str:map.values()){
        //     System.out.println(str);
        // }
        System.out.println(map);
    

        // System.out.println(map.get("20D105"));
        // System.out.println(map.get("Anand"));
    }
}