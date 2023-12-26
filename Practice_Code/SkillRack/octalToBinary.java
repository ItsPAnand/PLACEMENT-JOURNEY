package SkillRack;
import java.util.*;

public class octalToBinary{
    public static void main(String[] args) {
        int octalNum=14;
        String binaryVal=octalTOBin(octalNum);
        System.out.println(binaryVal);
    }
    private static String octalTOBin(int N) {
        int decimal=0;
        int step=0;
        while(N!=0){
            int digit=N%10;
            decimal=decimal+(digit*(int)Math.pow(8,step));
            step++;
            N/=10;
        }
        String binaryVal="";
        while(decimal!=0){
            int digit=decimal%2;
            binaryVal+=String.valueOf(digit);
            decimal/=2;
        }
        return reverse(binaryVal);
    }
    private static String reverse(String N) {
        return new StringBuilder(N).reverse().toString();   
    }
}