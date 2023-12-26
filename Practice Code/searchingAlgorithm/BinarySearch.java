package searchingAlgorithm;

import java.util.Arrays;
import java.util.random.*;

public class BinarySearch {
    public static void main(String[] args) {
        int array[]=new int[100];
        int target=99;
        for(int i=array.length-1;i>=0;i--)
            array[i]=i;

        // int index=Arrays.binarySearch(array,target);    //Inbuilt function
        int index =BinarySearching(array,target);
        if(index==-1)
            System.out.println("Element not found");
        else
            System.out.println("The target value "+target+" is found at index: "+index);
    }

    private static int BinarySearching(int[] array, int target) {
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            //int middle=(high-low)/2;
            int value=array[middle];
            if(value<target) {low=middle+1;}
            else if(value>target) {high=middle-1;}
            else {return middle;}
        }
        return -1;
    }
}
