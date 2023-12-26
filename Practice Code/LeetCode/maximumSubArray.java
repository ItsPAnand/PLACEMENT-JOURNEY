package LeetCode;

public class maximumSubArray {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSub(nums));
    }
    public static long maxSub(int arr[]){
        long sum=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum>=0){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
