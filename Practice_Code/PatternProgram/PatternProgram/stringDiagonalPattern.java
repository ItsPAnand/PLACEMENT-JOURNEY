package PatternProgram;

public class stringDiagonalPattern {
    public static void main(String[] args) {
        String S="ZO-HO";
        int left=0,right=S.length()-1,space=S.length()-2,middle=S.length()/2;
        int ctr=0;
        while(left<right){
            System.out.print(S.charAt(left));
            for(int i=1;i<=space;i++)
                System.out.print(" ");
            System.out.print(S.charAt(right));
            System.out.println();
            for(int j=0;j<=ctr;j++)
                System.out.print(" ");
            space-=2;
            ctr++;
            left++;
            right--;
        }
        System.out.println(S.charAt(middle));

        left=middle-1;
        right=middle+1;
        space=1;
        int ctr1=middle-1;
        while(left>=0){
            for(int i=ctr1;i>0;i--)
                System.out.print(" ");
            System.out.print(S.charAt(left));
            for(int i=1;i<=space;i++)
                System.out.print(" ");
            System.out.print(S.charAt(right));
            System.out.println();
            ctr1--;
            left--;
            right++;
            space+=2;
        }
    }
}
