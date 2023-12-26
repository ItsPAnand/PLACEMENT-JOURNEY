package PatternProgram;

public class stairCase {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int space=n-1;space>i;space--)
                System.out.print("  ");
            for(int stair=0;stair<=i;stair++)
                System.out.print("# ");
            System.out.println();
        }
    }
}
