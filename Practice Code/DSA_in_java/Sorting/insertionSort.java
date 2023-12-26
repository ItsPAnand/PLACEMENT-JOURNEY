package DSA_in_java.Sorting;

import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={32,144,6,34,1,35,-43,0};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionsort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
}
