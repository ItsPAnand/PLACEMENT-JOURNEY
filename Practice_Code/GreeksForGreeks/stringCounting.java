import java.util.*;

public class stringCounting {
    public static void main(String[] args) {
        String S="abaaa";
        System.out.println("Nuumber of unique string from substring is "+contingTheUnique(S));
    }

    private static int contingTheUnique(String s) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                StringBuilder str=new StringBuilder(s);
                String subStr=s.substring(i, j+1);
                subStr=reverse(subStr);
                str.replace(i, j+1, subStr);
                set.add(str.toString());
            }
        }
        return set.size();
    }

    private static String reverse(String s) {
        StringBuilder str=new StringBuilder(s).reverse();
        return str.toString();
    }
}
