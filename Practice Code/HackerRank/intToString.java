package HackerRank;

public class intToString {
    public static void main(String[] args) {
        String s="12344";
        int i=covert(s);
        System.out.println(i);
    }

    public static int covert(String s) {
        int num=0;
        for(char ch:s.toCharArray()){
            num=(num*10)+(ch-48);
            // System.out.println(num);
        }
        return num;
    }

}
