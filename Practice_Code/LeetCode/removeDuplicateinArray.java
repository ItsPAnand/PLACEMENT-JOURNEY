/*
 * Rmoving duplicate in sorted array
 */
package LeetCode;

public class removeDuplicateinArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,4,5,5,5,6,6,6,6,6};
        int length=removeDuplicate(arr);
        for(int i=0;i<length;i++)
            System.out.print(arr[i]+"\t");
    }
    public static int  removeDuplicate(int[] arr) {
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
}
