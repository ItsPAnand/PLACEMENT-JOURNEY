// print longest substring without repeating character

package LeetCode;

import java.util.*;

public class longestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String S="abcab";
        System.out.println(findLongestSubstring(S));
    }
    public static int findLongestSubstring(String S){
        int start=0,end=0;
        int maxLen=0;

        HashSet<Character> set=new HashSet<>();
        while(end<S.length()){
            char c=S.charAt(end);
            while(set.contains(c)){
                set.remove(S.charAt(start));
                start++;
            }
            set.add(c);
            int windowSize=end-start+1;
            maxLen=Math.max(maxLen,windowSize);
            end++;
        }

        return maxLen;
    }
}
