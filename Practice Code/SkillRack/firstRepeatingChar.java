package SkillRack;

public class firstRepeatingChar {
    public static void main(String[] args) {
        String s="adefcghbt";
        for(int i=0;i<s.length();i++){
            String temp="";
            char ch=s.charAt(i);
            temp=s.substring(i+1,s.length());
            if(temp.indexOf(ch)==-1)
                continue;
            else{
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}
