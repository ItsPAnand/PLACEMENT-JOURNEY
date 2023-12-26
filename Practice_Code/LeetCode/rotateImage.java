package LeetCode;

public class rotateImage {
    public static void main(String[] args) {
        int matrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        /*
         * step 1 - take tranpose
         * step 2 - reverse each row
         */
        rotate(matrix);
        print(matrix);
    }

    public static void rotate(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(j>=i){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }

        for(int i=0;i<mat.length;i++){
            int left=0,right=mat[i].length-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void print(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
