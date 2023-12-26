package HackerRank;
import java.util.*;
public class pangramOrNot {
    public static void main(String[] args) {
        String input="We promptly judged antique ivory buckles for the next prize";
        String output=checkPangram(input);
        System.out.println(output);
    }

    private static String checkPangram(String s) {
        boolean flag=true;
        s=s.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(String.valueOf(ch))){
                flag=false;
                break;
            }
        }
        if(!flag)
            return "not pangram";
        return "pangram";
    }
}
