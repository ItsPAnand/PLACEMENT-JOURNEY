package LeetCode;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,1,0,0,0,1,1,1,0,1,0,1,1,1,1,1,1};
        
        int maxOnes=0,currOnes=0;
        for(int i:nums){
            if(i==1)
                currOnes++;
            if(i!=1){
                maxOnes=Math.max(maxOnes,currOnes);
                currOnes=0;
            }
        }
        maxOnes=Math.max(maxOnes,currOnes);

        System.out.println(maxOnes);
    }
}
