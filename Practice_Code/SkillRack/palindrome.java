package SkillRack;

public class palindrome {
    public static void main(String[] args) {
        String S="-121";
        int right=S.length()-1;
        int left=0;
        boolean flag=false;
        while(left<right){
            if(S.charAt(left)!=S.charAt(right)){
                flag=true;
                break;
            }
            left++;
            right--;
        }
        if(!flag)
            System.out.println("Palindrome");
        else
            System.out.println("not a palindrome");

    }
}
