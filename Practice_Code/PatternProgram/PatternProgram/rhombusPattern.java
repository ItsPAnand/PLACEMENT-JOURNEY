package PatternProgram;

public class rhombusPattern {
    public static void main(String[] args) {
        int N=10;
        printRhombusPattern(N);
    }
    public static void printRhombusPattern(int N){
        int space=N;
        for(int i=0;i<N;i++){
            for(int j=0;j<space;j++)
                System.out.print(" ");
            for(int k=0;k<N;k++)
                System.out.print("*");
            space--;
            System.out.println();
        }
    }
}
