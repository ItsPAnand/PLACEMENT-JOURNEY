package PatternProgram;

public class invertedPyramid {
    public static void main(String[] args) {
        int N=6;
        printinvertedPyramid(N);
    }   
    public static void printinvertedPyramid(int N){
        int printCtr=(N*2)-1;
        for(int i=0;i<N;i++){
            for(int k=0;k<=i;k++)
                System.out.print(" ");
            for(int j=0;j<printCtr;j++)
                System.out.print("*");
            printCtr-=2;
            System.out.println();
        }
    }
}
