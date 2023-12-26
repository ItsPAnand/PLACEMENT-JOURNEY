package PatternProgram;

public class matrixPattern {
    public static void main(String[] args) {
        int N=3;
        for(int i=1;i<=N*N;i++){
            System.out.print("*"+" ");
            if(i%N==0)
                System.out.println();
        }
    }
}
