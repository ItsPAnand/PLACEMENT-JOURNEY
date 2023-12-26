package PatternProgram;

public class lookAndSayPattern {
    public static void main(String[] args) {
        int n=7;
        System.out.println(1);
        String prev="1";
        int i=1;
        while(i<n){
            String curr="";
            int count=1;
            char ch=prev.charAt(0);

            for(int j=1;j<prev.length();j++){
                if( prev.charAt(j)!=prev.charAt(j-1) ){
                    System.out.print(count+""+ch);
                    curr+=""+count+""+ch;
                    ch=prev.charAt(j);
                    count=1;
                }
                else
                    count++;
            }
            System.out.print(count+""+ch);
            curr+=""+count+""+ch;
            prev=curr;
            i++;

            System.out.println();
        }
    }
}
