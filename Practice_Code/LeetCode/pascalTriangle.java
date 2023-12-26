package LeetCode;

import java.util.*;

public class pascalTriangle{
    public static void main(String[] args) {
        int rowsNum=5;
        generatePascalTriangle(rowsNum);
    }
    public static void generatePascalTriangle(int rowsNum){
        ArrayList<ArrayList<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<rowsNum;i++){
            ArrayList<Integer> currRows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i )
                    currRows.add(1);
                else{
                    ArrayList<Integer> prev=pascal.get(i-1);
                    currRows.add(prev.get(j)+prev.get(j-1));
                }
            }
            pascal.add(currRows);
        }
        print(pascal,rowsNum);
    }
    public static void print(ArrayList<ArrayList<Integer>> pascal,int N){
        for(int i=0;i<N;i++){
            ArrayList<Integer> row=pascal.get(i);
            for(int space=N-i-1;space>=0;space--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print(row.get(j)+" ");
            System.out.println();
        }
    }
}