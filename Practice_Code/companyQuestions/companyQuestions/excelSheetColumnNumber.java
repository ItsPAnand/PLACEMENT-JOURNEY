package companyQuestions;

public class excelSheetColumnNumber {
    public static void main(String[] args) {
        String S="ZZ";
        int result=0;
        for(int i=0;i<S.length();i++){
            result*=26;
            result+=S.charAt(i)-'A'+1;
        }
        System.out.println(result);
    }
}
