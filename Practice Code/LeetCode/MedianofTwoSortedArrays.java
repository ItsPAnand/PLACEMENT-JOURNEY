package LeetCode;

import java.util.*;

public class MedianofTwoSortedArrays {

    public static double ArrayMedian(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums1)
            arr.add(i);
        for(int i:nums2)
            arr.add(i);
        Collections.sort(arr);
        int length=arr.size();
       // System.out.println(length);
        if((length)%2==0){
            int median=arr.get((length)/2)+arr.get((length/2)-1);
            return median/2.0;
        }
        return (double)arr.get(length/2);
    }
    public static void main(String[] args) {
        int []nums1 = {1,3,5,7};
        int []nums2 = {2,4,6,8};
        System.out.println(ArrayMedian(nums1,nums2));
    }
}
