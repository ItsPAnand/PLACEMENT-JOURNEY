package HackerRank;

import java.util.*;

public class countingValleys {
    public static void main(String[] args) {
        String path="DUDDDUDUUUU";
        System.out.println(valley(path));
    }
    public static int valley(String S){
        int height=0,count=0;
        for(char c:S.toCharArray()){
            if(c=='U'){
                height++;
                if(height==0){
                    count++;
                }
            }
            else{
                height--;
            }
        }
        return count;
    }
}
