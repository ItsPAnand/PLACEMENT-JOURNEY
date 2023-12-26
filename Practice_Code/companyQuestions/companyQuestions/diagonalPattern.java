package companyQuestions;

import java.util.*;

public class diagonalPattern {
    public static void main(String[] args) {
        String S="1234567";
        int length=S.length();
        char output[][]=new char[length][length];
        
        int forCtr=0,revChar=length-1;

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j)
                    output[i][j]=S.charAt(forCtr++);
                else
                    output[i][j]=' ';
                if( (i+j)==length-1 )
                    output[i][j]=S.charAt(revChar--);
                
            }
        }

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print(output[i][j]+"");
            }
            System.out.println();
        }
    }
}
