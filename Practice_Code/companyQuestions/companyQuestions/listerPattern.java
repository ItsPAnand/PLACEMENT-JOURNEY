package companyQuestions;

public class listerPattern {
    public static void main(String[] args) {
        int N=9;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                if( j<i )
                    System.out.print("*");
            }
            System.out.println();
        }

        for(int i=N-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                if(j<i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
 * output
 * 
 * 1
 * 2*2
 * 3*3*3
 * 3*3*3
 * 2*2
 * 1
 * 
 */