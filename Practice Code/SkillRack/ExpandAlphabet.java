package SkillRack;

public class ExpandAlphabet {
    public static void main(String[] args) {
        String S="100q3c5r";
        String temp="";
        for(char ch:S.toCharArray()){
            if( !((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')) ){
                temp+=ch;
            }
            else{
                int count=Integer.parseInt(temp);
                temp="";
                for(int i=0;i<count;i++){
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}
