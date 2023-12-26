import java.util.*;

public class panagramOrNot{
    public static void main(String[] args) {
        String S="the quick brown for fox jumps over the lazy Dog";
        S=S.toLowerCase();
        int alphabet[]=new int[26];

        for(char c:S.toCharArray()){
            if(c!=' ')
                alphabet[c-'a']++;
        }

        for(int i:alphabet){
            if(i==0){
                System.out.println("Not Panagram");
                System.exit(0);
            }
        }
        System.out.println("yes Panagram");
    }
}