package TCS_NQT_Coding;

public class convertAndToggleBinary{
    public static void main(String args[]){
        int dec = 10;
        // binary conversion
        String bin = Integer.toBinaryString(dec);
        // System.out.println(bin);

        String toogleBin="";
        // toogle the bits
        for(char ch:bin.toCharArray()){
            if(ch=='0')
                toogleBin+="1";
            else
                toogleBin+="0";
        }
        // System.out.println(toogleBin);

        // binary to decimal conversion
        int decimal=Integer.parseInt(toogleBin,2);  
        System.out.println(decimal);
        
    }
}



// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

// Constrains-

// 1<=N<=100

// Example 1:

// Input :

// 10  -> Integer

// Output :

// 5    -> result- Integer

// Explanation:

// Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.