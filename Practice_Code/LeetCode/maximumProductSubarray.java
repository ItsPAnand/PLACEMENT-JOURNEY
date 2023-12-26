package LeetCode;

public class maximumProductSubarray {
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int nums[]){
        int max=nums[0];
        int left=1,right=1;
        for(int i=0;i<nums.length;i++){
            left=left==0?1:left;
            right=right==0?1:right;

            left*=nums[i];
            right*=nums[nums.length-1-i];

            max=Math.max(max,Math.max(left,right));
        }
        return max;
    }
}
