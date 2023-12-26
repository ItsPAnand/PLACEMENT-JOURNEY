import java.util.*;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int n=5,K=12;
        for(int i:findSubArrayGivenSum(arr,n,K)){
            System.out.print(i+"  ");
        }

    }
    static ArrayList<Integer> findSubArrayGivenSum(int[] arr, int n, int s) {
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;
        int sum=arr[0];
        while(j<n){
            if(sum==s){
                result.add(i+1);
                result.add(j+1);
                return result;
            }
            if(sum<s){
                j++;
                sum+=arr[j];
                continue;
            }
            if(sum>s){
                sum-=arr[i];
                i++;
                continue;
            }
        }
        result.add(-1);
        return result;
    }
}
