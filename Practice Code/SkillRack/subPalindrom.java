package SkillRack;

import java.util.*;

public class subPalindrom{
    public static int countPalindromes(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
        //Taking every node as a center and expanding it from there to check if it is a palindrome or not.
        //This will make sure that the length of the string to be checked > 2.
            count += expandFromCenter(s, i-1, i+1) +  expandFromCenter(s, i , i+1);
        }
       
        return count;  
    }
 
    public static int expandFromCenter(String s, int left, int right){
        int count = 0;
        //As we expand from the center and find if the character matches, we increase the count.
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
 
    public static void main (String[] args) {
        String s = "abccbaab";
        System.out.println(countPalindromes(s));
  }
}