package companyQuestions;

import java.util.*;

public class printIncreaseAndDecreaseIndexing {
    public static void main(String[] args) {
           int arr[]={11,31,4,3,9};
           print(arr);
    }
    public static void print(int num[]){
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if( i%2==0 )
                odd.add(num[i]);
            else
                even.add(num[i]);
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println(odd+"\n"+even);
        int output[]=new int[num.length];
        int oddIndex=odd.size()-1;
        int evenIndex=0;
        for(int i=0;i<output.length;i++){
            if( i%2==0 ){
                output[i]=odd.get(oddIndex);
                oddIndex--;
            }
                
            else{
                output[i]=even.get(evenIndex);
                evenIndex++;
            }
                
        }
        System.out.println(Arrays.toString(output));
    }
}
