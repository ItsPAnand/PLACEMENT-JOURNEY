package LeetCode;

public class buysAndSellStock_1 {
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        System.out.println(maximumProfit(nums));
    }

    public static int maximumProfit(int nums[]){
        int profit=0;
        int buyingPrice=nums[0];
        for(int i:nums){
            if(i<=buyingPrice){
                buyingPrice=i;
                continue;
            }
            profit=Math.max(profit,i-buyingPrice);
        }
        return profit;
    }
}
