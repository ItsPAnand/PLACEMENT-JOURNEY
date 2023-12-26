/* 5 ABCDE
 * A
 * BC
 * DEA
 * BCDE
 * ABCDE
 */

package PatternProgram;

import java.util.*;

public class CircularStringTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String S=sc.next();
        int ctr=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(S.charAt(ctr));
                ctr++;
                ctr=ctr%S.length();
            }
            System.out.println();
        }
        sc.close();
    }
}
