package PatternProgram;
import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ctr=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ctr+" ");
                ctr++;
            }
            System.out.println();
        }
        sc.close();
    }
}
