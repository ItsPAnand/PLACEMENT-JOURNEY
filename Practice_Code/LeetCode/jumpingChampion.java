package LeetCode;

import java.util.*;

public class jumpingChampion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound and upper bound values: \n");
        int lowerBound=6;
        int upperBound=89;
        int champions=findJumpingChampion(lowerBound,upperBound);
        if(champions>1)
            System.out.println("The jumping champion is "+champions);
        else
            System.out.println("No jumping champions");

    }

    public static boolean isPrime(int n){
        if(n<2)
            return true;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> findingPrimeDiff(ArrayList<Integer> arr){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            temp.add(Math.abs(arr.get(i)-arr.get(i+1)));
        }
        return temp;
    }

    public static int findJumpingChampion(int LB, int UB) {
        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=LB;i<=UB;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        System.out.println("primes list\n"+primes);
        ArrayList<Integer> primeDiff=findingPrimeDiff(primes);
        System.out.println("prime diff list\n"+primeDiff);
        int maxCount=0,maxNum=0;
        for(int i:primeDiff){
            int count=0;
            for(int j:primeDiff){
                if(i==j){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                maxNum=i;
            }
        }
        return maxNum;
    }    
}
