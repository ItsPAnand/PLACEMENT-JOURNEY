package TCS_NQT_Coding;

public class lowerTrianglarMatrixorNot{
    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 0, 0 },
                        { 1, 4, 0, 0 },
                        { 4, 6, 2, 0 },
                        { 0, 4, 7, 6 } };

        if(isLowerTriangle(mat))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean isLowerTriangle(int mat[][]){
        int rows=mat.length;
        int col=mat[0].length;
        for (int i=0;i<rows;i++){
            for(int j=i+1;j<col;j++){
                if(mat[i][j]!=0)
                    return false;
            }
        }
        return true;
    }
}