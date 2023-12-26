package SkillRack;
import java.util.*;
public class ToweerLineOfSightIssue {
    public static void main(String[] args) {
        String inputA="0 0";
        String inputB="0 -2";
        String inputC="2 0";
        String inputD="0 -5";

        String a[]=inputA.split(" ");
        String b[]=inputA.split(" ");
        String c[]=inputA.split(" ");
        String d[]=inputA.split(" ");

        int A[]=new int[a.length];
        int B[]=new int[a.length];
        int C[]=new int[a.length];
        int D[]=new int[a.length];

        for(int i=0;i<A.length;i++){
            A[i]=Integer.parseInt(a[i]);
            B[i]=Integer.parseInt(b[i]);
            C[i]=Integer.parseInt(c[i]);
            D[i]=Integer.parseInt(d[i]);
        }

        for(int i=0;i<A.length-1;i++){
            if( (A[i]==B[i] && A[i]==D[i]) || (A[i+1]==B[i+1] && A[i+1]==D[i+1]) ){
                System.out.println("yes");
            }
            else
                System.out.println("no");
        }
    }
}
