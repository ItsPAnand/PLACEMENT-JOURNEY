package companyQuestions;


import java.util.*;
import java.lang.Iterable;
public class Abundant {
    public static void main(String[] args) {
        int N=11410;
        if(isAundant(N))
            System.out.println(N+" is Abundant Number");
        else
            System.out.println(N+" is not Abundant Number");
    }

    private static boolean isAundant(int n) {
        ArrayList<Integer> value=new ArrayList<>();
        value=factors(n);
        int sum=0;
        for(int i=0;i<value.size();i++)
            sum+=value.get(i);
        if(sum>n)
            return true;
        return false;
    }

    public static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                // System.out.print(i+" ");
                temp.add(i);
            }
        }
        return temp;
    }
}
