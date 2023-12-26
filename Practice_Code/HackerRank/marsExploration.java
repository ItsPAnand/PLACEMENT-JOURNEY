package HackerRank;

public class marsExploration {
    public static void main(String[] args) {
        String input="SOSSPSSQSSOR";
        int output=noOfLetterAltered(input);
        System.out.println(output);
    }

    private static int noOfLetterAltered(String s) {
        int error=0;
        int start=0,end=3;
        while(start<s.length() && end<=s.length()){
            String temp=s.substring(start, end);
            if( !( temp.equals("SOS") )  ){
                //error++;
                if(!( temp.charAt(0)=='S' ))
                    error++;
                if(!( temp.charAt(1)=='O' ))
                    error++;
                if(!( temp.charAt(2)=='S' ))
                    error++;
            }
            
            start+=3;
            end+=3;
        }
        return error;

        // int change = 0;
        // String pattern = "SOS";

        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) != pattern.charAt(i % 3)) {
        //         change++;
        //     }
        // }

        // return change;
    }
}
