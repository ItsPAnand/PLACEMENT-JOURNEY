package LeetCode;

class validPalindrome{
    public static void main(String[] args) {
        String s="aaa.,,.,#@.aaa";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        s=s.replaceAll(" ","");
        s=s.replaceAll("\\p{P}","");                 //   \\p{P}
        StringBuilder str=new StringBuilder(s).reverse();
        if( s.equals(str.toString()) )
            return true;
        return false;
    }
}