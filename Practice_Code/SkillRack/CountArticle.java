/* count the words like a,an,the */

package SkillRack;
import java.util.*;
public class CountArticle {
    public static void main(String[] args) {
        String S="I went to a movie yesterday along with an, the the, old man";
        String parts[]=S.split(" ");
        int ctr=0;
        for(String str:parts){
            if(str.equals("a") || str.equals("an") || str.equals("the") || str.equals("the,") || str.equals("a,") || str.equals("an,")){
                ctr++;
            }
            //System.out.println(str);
        }
        System.out.println(ctr);
    }
}
