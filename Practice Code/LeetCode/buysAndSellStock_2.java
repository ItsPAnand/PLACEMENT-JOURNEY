package LeetCode;

public class buysAndSellStock_2 {
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        System.out.println(maximumProfit(nums));
    }

    public static int maximumProfit(int nums[]){
        int profit=0;
        int buying=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=buying)
                buying=i;
            
            else{
                profit=profit+(i-buying);
                buying=i;
            }
        }
        return profit;
    }
}
