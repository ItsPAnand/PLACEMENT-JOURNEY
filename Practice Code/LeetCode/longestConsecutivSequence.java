package LeetCode;

import java.util.HashSet;

public class longestConsecutivSequence {
    public static void main(String[] args) {
        int nums[]={6,5,100,4,200,3,2,1};
        System.out.println(findingMaxConsecutive(nums));
 
   }
    private static int findingMaxConsecutive(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
            set.add(i);
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(set.contains(val-1))
                continue;
            int currLen=0;
            while(set.contains(val)){
                currLen++;
                val++;
            }
            maxLen=Math.max(maxLen,currLen);
        }
        return maxLen;

    }
}
