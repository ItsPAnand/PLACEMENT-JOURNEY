package LeetCode;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int nums[]={7,11,15,8,2};
        int targt=9;
        System.out.println(Arrays.toString(findSum(nums,targt)));
    }
    public static int[] findSum(int nums[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compl=target-nums[i];
            if(map.containsKey(compl))
                return new int[]{map.get(compl),i};
            
            map.put(nums[i], i);
        }
        return null;
    }
    
}
