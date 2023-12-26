package companyQuestions;

public class luckyStringOrNot {
    public static void main(String[] args) {
        String S="Indian Airlines PVT LTD";
        luckyOrNot(S);
    }
    public static void luckyOrNot(String s){
        s=s.replace(" ","");
        s=s.toUpperCase();
        int freq[]=new int[26];
        for(char ch:s.toCharArray())
            freq[(int)ch-65]++;
        int sum=0;
        for(int i:freq){
            if(i>=2)
                sum+=i;
        }
        System.out.println(sum);
        String bin=Integer.toBinaryString(~sum);
        System.out.println(Integer.toBinaryString(sum));
        System.out.println(bin.charAt(bin.length()-1));
    }
}
