package companyQuestions;

public class wordGuessingGamePuzzle {
    public static void main(String[] args) {
        String word="SPACE";
        String guess="SIREN";
        System.out.println(guessTheWord(word,guess));
    }
    public static String guessTheWord(String word,String guess){
        String result="";
        int i=0;
        while(i<word.length()){
            if( word.charAt(i)==guess.charAt(i) ){
                result+="g";
            }
            else if( (word.indexOf(guess.charAt(i)))==-1 ){
                result+="-";
            }
            else{
                result+="y";
            }
            i++;
        }
        return result;
    }
}
