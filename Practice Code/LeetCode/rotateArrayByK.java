package LeetCode;

import java.util.Arrays;

public class rotateArrayByK {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};         // output=5,6,7,1,2,3,4
        int k=3;
        rotateArray(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArray(int[] nums, int k) {
        if(nums.length==1 || nums.length==k || nums==null)
            return;
        if(k>nums.length)
            k=k%nums.length;
        
        int left=0;
        int right=nums.length-k-1;
        int nextLeft=right+1;
        int temp;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        right=nums.length-1;
        while(nextLeft<right){
            temp=nums[nextLeft];
            nums[nextLeft]=nums[right];
            nums[right]=temp;
            nextLeft++;
            right--;
        }
        left=0;
        right=nums.length-1;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
