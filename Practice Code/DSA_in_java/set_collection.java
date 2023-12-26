package DSA_in_java;

import java.util.*;

/*
 * set - only unique elements or not duplicate cannot be added
 * HashSet - hashing
 */

public class set_collection {
    public static void main(String[] args) {
        // HashSet<String> h=new HashSet<>();
        // h.add("Anand");
        // h.add("Sharah");
        // h.add("Bharath");
        // h.add("Akilesh");
        // h.add("SakthiVel");
        // h.add("Vasanth");
        // h.add("Vasanth");

        HashSet<Integer> h=new HashSet<>();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(100);
        h.add(-21);
        
        System.out.println(h);

    }
}
