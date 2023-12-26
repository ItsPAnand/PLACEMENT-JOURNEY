package SkillRack;
import java.util.*;
public class ReverseLastKwords{
    public static void main(String[] args) {
        String input="There is nothing permanent except change";
        int K=3;
        String parts[]=input.split(" ");
        for(int i=0;i<(parts.length-K);i++){
            System.out.print(parts[i]+" ");
        }
        for(int j=parts.length-1;j>=K;j--){
            System.out.print(parts[j]+" ");
        }
    }
}
