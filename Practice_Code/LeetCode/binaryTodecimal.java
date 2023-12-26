package LeetCode;

public class binaryTodecimal {
    public static void main(String[] args) {
        String S="10100000100100110110010000010101111";
        long decimal=decimalConversion(S);
        System.out.println(decimal);
    }
    
    public static long decimalConversion(String s){
        int length=s.length()-1;
        long result=0;
        long count=0;
        for(int i=length;i>=0;i--){
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            result+=(long)(digit*Math.pow(2, count));
            count++;
        }
        return result;
    }
}
