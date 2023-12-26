package companyQuestions;

public class reverseString {
    public static void main(String[] args) {
        String s="bharath";
        System.out.println(reverseTheString(s));
    }
    public static String reverseTheString(String S){
        int right=S.length()-1;
        int left=0;
        char str[]=S.toCharArray();
        while(left<right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        return new String(str);
    }
}
