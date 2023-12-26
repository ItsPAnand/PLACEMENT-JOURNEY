package LeetCode;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int nums[]={1,3,5,4,2};
        System.out.println(findingNextPermutation(nums));
    }
    
    public static String findingNextPermutation(int nums[]){
        int breakIndex=nums.length-2;
        while(breakIndex>=0 && nums[breakIndex]>=nums[breakIndex+1])
            breakIndex--;
        
        
        if(breakIndex>=0){
            int swapIndex=nums.length-1;
            while( nums[swapIndex]<=nums[breakIndex] )
                swapIndex--;
            
            swap(nums,breakIndex,swapIndex);
        }
        reverse(nums,breakIndex+1,nums.length-1);

        return Arrays.toString(nums);
    }

    public static void reverse(int[] nums, int i, int j) {
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
    public static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
