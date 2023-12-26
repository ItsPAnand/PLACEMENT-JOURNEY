package DSA_in_java.Sorting;

import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={9,7,34,432,6,22,-3,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
