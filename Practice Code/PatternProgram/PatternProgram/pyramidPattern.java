package PatternProgram;

public class pyramidPattern {
    public static void main(String[] args) {
        int N=10;

        for(int i=0;i<N;i++){
            for(int j=N-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}
