package LeetCode;
/*
 * using MOORE'S VOTING ALGORITHM
 * 
 */
public class majorityElement {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,2,2,1,1,1,1};
        System.out.println(majority(nums));
    }
    public static int majority(int nums[]){
        int candidate=0,points=0;
        for(int i=0;i<nums.length;i++){
            if(points==0)
                candidate=nums[i];
            if(candidate==nums[i])
                points++;
            else
                points--;
        }
        return candidate;
    }
}
