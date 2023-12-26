package companyQuestions;
import java.util.*;

public class SemiperfectNumberOrNot {
    public static void main(String[] args) {
        int N=40;
        ArrayList<Integer>list=new ArrayList<>();
        list=factors(N);

        if(isSemiPerfect(N,list))
            System.out.println("\n"+N+" is Semi perfect number");
        else 
            System.out.println("\n"+N+" is not a semi perfeect number");
    }

    public static boolean isSemiPerfect(int N, List<Integer> list) {
        if (N == 0)
            return true;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.remove(i);
            if (isSemiPerfect(N - temp, list)) // using recursion
                return true;
            list.add(i, temp);
        }
        return false;
    }

    public static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
                temp.add(i);
            }
        }
        return temp;
    }
}
