package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        HashMap<Integer,Boolean> s=new HashMap<>();
        for(int i:nums){
            if(s.containsKey(i)){
                System.out.println("True");
                System.exit(0);
            }
            s.put(i,true);
        }
        System.out.println("False");
    }
}
