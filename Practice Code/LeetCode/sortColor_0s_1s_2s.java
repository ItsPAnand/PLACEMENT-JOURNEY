package LeetCode;

import java.util.*;

public class sortColor_0s_1s_2s {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,1,0,1,0};        
        sortColor(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColor(int arr[]){
        int ctr_0s=0,ctr_1s=0,ctr_2s=0;
        for(int i:arr){
            if(i==0)
                ctr_0s++;
            if(i==1)
                ctr_1s++;
            if(i==2)
                ctr_2s++;
        }
        for(int i=0;i<ctr_0s;i++)
            arr[i]=0;
        for(int i= ctr_0s;i<ctr_0s+ctr_1s;i++)
            arr[i]=1;
        for(int i=ctr_0s+ctr_1s;i<arr.length;i++)
            arr[i]=2;
    }

}
