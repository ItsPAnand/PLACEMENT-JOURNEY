// write a code for return the largest rows and column sum in a matrix

package companyQuestions;

import java.util.*;

public class largestRowandColumnSuminMatrix{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(largestRowSum(matrix));
        System.out.println(largestColumnSum(matrix));
    }
    public static int largestRowSum(int mat[][]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            int temp=0;
            for(int j=0;j<mat[i].length;j++){
                temp+=mat[i][j];
            }
            maxi=Math.max(maxi,temp);
        }
        return maxi;
    }

    public static int largestColumnSum(int mat[][]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            int temp=0;
            for(int j=0;j<mat[i].length;j++){
                temp+=mat[j][i];
            }
            maxi=Math.max(maxi,temp);
        }
        return maxi;
    }
}