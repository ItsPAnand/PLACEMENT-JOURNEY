package DSA_in_java.Sorting;

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={43,1,4,68,99,7648,-58};
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void bubblesort(int arr[]){
        for(int i=1;i<arr.length;i++){
            boolean swaped=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    swaped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swaped)
                break;
        }
    }
}
