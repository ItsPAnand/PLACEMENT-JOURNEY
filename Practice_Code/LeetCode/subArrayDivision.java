/*Given an array 
 * find count of subarray with size 'm' and sum of subarray is 'd'
*/

package LeetCode;

import java.util.*;

public class subArrayDivision {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2};
        int m=2;
        int d=3;
        System.out.println(findSubarayCoutn(arr,m,d));
    }

    public static int findSubarayCoutn(int[] arr,int m,int d) {
        int sum=0;
        for(int i=0;i<m;i++)
            sum+=arr[i];

        int count=0;
        if(sum==d)
            count++;
        
        for(int i=m;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-m];
            if(sum==d){
                count++;
            }
        }    
        return count;    
    }
}
