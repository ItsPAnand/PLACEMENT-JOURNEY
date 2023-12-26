package companyQuestions;

import java.util.*;

public class reversEachWordinArray {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(reverseEachWord(str));
    }
    public static String reverseEachWord(String S){
        String ans="";
        String part[]=S.split(" ");
        for(int i=0;i<part.length;i++){
            part[i]=new StringBuilder(part[i]).reverse().toString();
            part[i]=part[i].substring(0,1).toUpperCase()+part[i].substring(1);
            ans+=part[i]+" ";
        }
        return ans.trim();
    }

}
