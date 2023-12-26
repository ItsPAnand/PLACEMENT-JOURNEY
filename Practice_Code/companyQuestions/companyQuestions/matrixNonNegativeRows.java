package companyQuestions;

import java.util.*;

public class matrixNonNegativeRows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();

        int n=3;
        for(int i=0;i<n;i++){
            ArrayList<Integer> rowEle=new ArrayList<>();
            for(int j=0;j<n;j++){
                rowEle.add(sc.nextInt());
            }
            matrix.add(rowEle);
        }
        // System.out.println(matrix);

        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix.get(i).get(j)==-1){
                    temp[i]=-1;
                }
            }
        }

        // System.out.println(Arrays.toString(temp));

        for(int i=0;i<n;i++){
            if(temp[i]!=-1)
                System.out.println(matrix.get(i));
        }

    }
}
