package SkillRack;

import java.util.Scanner;

public class minimumDistanceBetweenWords{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        String s="game will mark  the first game the venue is hosting an international match since 2015"; 
        String w1="will";
        String w2="first";
        if (w1 .equals( w2) )
            System.out.println(0);
        String words[] = s.split(" ");
        int min_dist = (words.length) + 1;

        for (int index = 0;index < words.length ; index ++){
            if (words[index] .equals( w1)){
                for (int search = 0;search < words.length; search ++){
                    if (words[search] .equals(w2)){
                        int curr = Math.abs(index - search);
                        if (curr < min_dist){
                            min_dist = curr ;
                        }
                    }   
                }
            }
        }
        System.out.println(min_dist);
    }
}