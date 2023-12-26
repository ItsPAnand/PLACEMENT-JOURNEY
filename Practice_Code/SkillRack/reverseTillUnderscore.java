package SkillRack;

public class reverseTillUnderscore {
    public static void main(String[] args) {
        String S="hello";
        int index=S.indexOf("_");
        if(index==0)
            System.out.println(S);
        else if(index==-1){
            StringBuilder result=new StringBuilder(S);
            System.out.println(result.reverse().toString());
        }
        else {
            StringBuilder result=new StringBuilder(S.substring(0, index)).reverse();
            System.out.println(result+S.substring(index,S.length()));
        }

    }
}
