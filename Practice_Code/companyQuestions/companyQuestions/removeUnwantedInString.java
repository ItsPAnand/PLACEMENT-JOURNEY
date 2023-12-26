package companyQuestions;
public class removeUnwantedInString {
    public static String removeMistypedCharacters(String input) {
        StringBuilder result = new StringBuilder();
        char prevChar = '\0'; // Initialize with a null character

        for (char currentChar : input.toCharArray()) {
            if (prevChar != currentChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaannnaanndd";
        String output = removeMistypedCharacters(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output); // Output: "ani"
    }
}
