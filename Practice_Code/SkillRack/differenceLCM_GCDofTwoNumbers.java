package SkillRack;

import java.util.*;

public class differenceLCM_GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextInt();
        long B=sc.nextInt();
        System.out.println(LeastCommonMultiple(A,B)-HighestCommonFactor(A,B));
        System.out.println(LeastCommonMultiple(A,B));
        System.out.println(HighestCommonFactor(A,B));
        sc.close();
    }

    public static long HighestCommonFactor(long a, long b) {
        long gcd=1;
        for(long i=1;i<=a||i<=b;i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        return gcd;
        // if(a==0)
        //     return b;
        //     HighestCommonFactor(b%a,b);
    }

    public static long LeastCommonMultiple(long a, long b) {
        long mul=a>b?a:b;
        long step=mul;
        while(true){
            if(mul%a==0 && mul%b==0)
                break;
            mul+=step;
        }
        return mul;
    }
}
