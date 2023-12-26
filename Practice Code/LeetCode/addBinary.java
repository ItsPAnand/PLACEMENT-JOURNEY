package LeetCode;

public class addBinary {
    public static void main(String[] args) {
        String s1="1010101010110111111001010101111101101",s2="1";
        System.out.println(addingBinartString(s1,s2));
    }

    public static String addingBinartString(String s1, String s2) { 
        long deci1=decimalConversion(s1);
        long deci2=decimalConversion(s2);
        return String.valueOf(deci1);
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
