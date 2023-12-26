package companyQuestions;

import java.util.ArrayList;
import java.util.List;

public class WeirdNumbers {

    public static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                // System.out.print(i+" ");
                temp.add(i);
            }
        }
        return temp;
    }

    public static boolean isSemiPerfect(int N, List<Integer> list) {
        if (N == 0)
            return true;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.remove(i);
            if (isSemiPerfect(N - temp, list)) // using recursion
                return true;
            list.add(i, temp);
        }
        return false;

        // int n = list.size();
        // boolean[][] dp = new boolean[n + 1][N + 1];

        // // Base case: subset sum of 0 is always possible
        // for (int i = 0; i <= n; i++) {
        //     dp[i][0] = true;
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= N; j++) {
        //         int currentNumber = list.get(i - 1);
        //         dp[i][j] = dp[i - 1][j]; // Exclude the current number

        //         if (j >= currentNumber) {
        //             dp[i][j] = dp[i][j] || dp[i - 1][j - currentNumber]; // Include the current number
        //         }
        //     }
        // }
        // return dp[n][N];
    }


    private static boolean isAundant(int n,ArrayList<Integer> list) {
        int sum=0;
        for(int i:list)
            sum+=i;
        if(sum>n)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 70;
        ArrayList<Integer>list=new ArrayList<>();
        list=factors(n);
 
        if ( isSemiPerfect(n, list)==false && isAundant(n,list)==true )
            System.out.println("Weird Number");
        else
            System.out.println("Not Weird Number");
    }
}
