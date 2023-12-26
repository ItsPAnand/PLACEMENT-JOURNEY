package LeetCode;

public class singleNumberinArray {
    public static void main(String[] args) {
        int nums[]={4,1,2,1,2};
        int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        System.out.println(ans);
    }
}
