package SkillRack;

import java.util.*;

public class OddStringDiagonalPattern {
    public static void main(String[] args) {
        String S="tiger";
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



/* The below code is minimization of above code by chat GPT */

// public class OddStringDiagonalPattern {
//     public static void main(String[] args) {
//         String S = "tiger";
//         int length = S.length();
//         int middle = length / 2;

//         for (int i = 0; i < middle; i++) {
//             System.out.print(S.charAt(i));
//             for (int j = 1; j < length - 1; j++)
//                 System.out.print(" ");
//             System.out.println(S.charAt(length - 1 - i));
//             length -= 2;
//         }

//         System.out.println(S.charAt(middle));

//         for (int i = middle - 1; i >= 0; i--) {
//             for (int j = i; j > 0; j--)
//                 System.out.print(" ");
//             System.out.print(S.charAt(i));
//             for (int j = 1; j <= length - 2; j++)
//                 System.out.print(" ");
//             System.out.println(S.charAt(S.length() - 1 - i));
//             length += 2;
//         }
//     }
// }
