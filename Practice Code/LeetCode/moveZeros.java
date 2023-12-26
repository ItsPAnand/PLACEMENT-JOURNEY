package LeetCode;

import java.util.*;


public class moveZeros{
    public static void main(String[] args) {
        int nums[]={0,0,3,0,6,4,2,0,0,0,9};
        zerosInTheLast(nums);
        System.out.println(Arrays.toString(nums));

    }
    private static void zerosInTheLast(int[] nums) {
        if(nums.length==1)
            return;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++)
            nums[i]=0;
    }   
}