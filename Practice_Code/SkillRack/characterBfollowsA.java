package SkillRack;

import java.util.Scanner;

public class characterBfollowsA {
    public static void main(String[] args) {
        String str="engine";
        char A='e';
        char B='n';
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==A && str.charAt(i+1)==B){
                count++;
            }
        }
        System.out.println(count);

    }
}
