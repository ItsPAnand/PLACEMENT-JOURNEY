package PatternProgram;

public class butterFlyPattern {
    public static void main(String[] args) {
        int n=5;
        int space=(n*2)-2;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++)
                System.out.print("*");
            for(int k=0;k<space;k++)
                System.out.print(" ");
            for(int j=0;j<i;j++)
                System.out.print("*");
            
            space-=2;
            System.out.println();
        }
        space=0;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++)
                System.out.print("*");
            for(int k=0;k<space;k++)
                System.out.print(" ");
            for(int j=0;j<i;j++)
                System.out.print("*");
            
            space+=2;
            System.out.println();
        }
    }
}
