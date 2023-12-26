package companyQuestions;
import java.util.*;

public class replaceMatrixWithCondition_BLUE_YONDER{
    public static void main(String[] args) {
        int mat[][]={{1,8},{3,6}};
        int X=3;
        replaceMatrix(mat,X);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void replaceMatrix(int mat[][],int X){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=replace(mat[i][j],X);
            }
        }
    }
    public static int replace(int A,int X){
        if( A%X==0 )
            return A;
        
        int result=0;
        for(int i=A-1;i>0;i--){
            if(i%X==0){
                result=i;
                break;
            }
        }
        return result;
    }
}