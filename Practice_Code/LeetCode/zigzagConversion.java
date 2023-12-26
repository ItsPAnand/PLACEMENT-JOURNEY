package LeetCode;

public class zigzagConversion {
    public static void main(String[] args) {
        String S="PAYPALISHRING";
        int numRows=3;
        /*
         * output
         * P   A   H   N
         * A P L S I I G
         * Y   I   R
         */
        printZigzag(S,numRows);
    }
    public static void printZigzag(String S,int numRows){
        String result[][]=new String[numRows][S.length()];
        int row=0,col=0;
        int curr=0;
        while( curr<S.length() ){
            while( row<numRows && curr<S.length() ){
                result[row++][col]=String.valueOf(S.charAt(curr++));
            }
            row=Math.max(0,row-2);
            while(row>0 && curr<S.length()){
                result[row--][++col]=String.valueOf(S.charAt(curr++));
            }
            col++;
        }
        String answer="";
        for(int i=0;i<numRows;i++){
            for(int j=0;j<S.length();j++){
                if(result[i][j]!=null)
                    answer+=result[i][j];
            }
        }
        System.out.println(answer);

    }
}
