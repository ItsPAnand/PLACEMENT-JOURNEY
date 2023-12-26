package PatternProgram;

public class diamondPattern {
    public static void main(String[] args) {
        int N=10;
        int i,j,k;

        for(i=0;i<N;i++){

            for(j=N-i-1;j>0;j--)
                System.out.print(" ");

            for(k=0;k<=i;k++)
                System.out.print("*"+" ");

            System.out.println();
        }

        for(i=N-1;i>=0;i--){

            for(j=0;j<N-i;j++)
                System.out.print(" ");

            for(k=0;k<i;k++)
                System.out.print("*"+" ");

            System.out.println();
        }

    }
}
