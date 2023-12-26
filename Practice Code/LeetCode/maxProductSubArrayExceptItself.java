package LeetCode;
import java.util.*;
public class maxProductSubArrayExceptItself {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        for(int i:maxProductExceptItself(nums)){
            System.out.print(i+"   ");
        }
    }
    public static int[] maxProductExceptItself(int nums[]){
        // int result[]=new int[nums.length];
        // int left[]=new int[nums.length];
        // int right[]=new int[nums.length];

        // left[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }
        // right[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }
        // for(int i=0;i<nums.length;i++){
        //     result[i]=left[i]*right[i];
        // }
        // return result;

        int result[]=new int[nums.length];
        int prefix=1,postfix=1;
        for(int i=0;i<nums.length;i++)
            result[i]=1;

        for(int i=0;i<nums.length;i++){
            result[i]=prefix;
            prefix=prefix*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*postfix;
            postfix=postfix*nums[i];
        }
        return result;

        
    }
}
