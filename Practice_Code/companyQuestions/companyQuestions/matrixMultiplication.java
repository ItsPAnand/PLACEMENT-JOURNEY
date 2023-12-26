package companyQuestions;
public class matrixMultiplication {
    public static void main(String[] args) {
        int arr1[][]={{2,3,4},{5,8,1}};
        int arr2[][]={{1,3},{4,5},{2,6}};
        multplicationOfMatrix(arr1,arr2);
    }

    public static void multplicationOfMatrix(int[][] arr1, int[][] arr2) {
        int arr1_rowLength=arr1.length;
        int arr1_colLength=arr1[0].length;
        int arr2_rowLength=arr2.length;
        int arr2_colLength=arr2[0].length;

        if(arr1_colLength!=arr2_rowLength){
            System.out.println("Matrix Multiplication cannot be determined");
        }
        else{
            int result[][]=new int[arr1_rowLength][arr2_colLength];
            for(int row=0;row<arr1_rowLength;row++){
                for(int col=0;col<arr2_colLength;col++){
                    result[row][col]=0;
                    for(int temp=0;temp<arr1_colLength;temp++){
                        result[row][col]+=arr1[row][temp]*arr2[temp][col];
                    }
                }
            }
            print(result);
        }
    }


    public static void print(int[][] result) {
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
