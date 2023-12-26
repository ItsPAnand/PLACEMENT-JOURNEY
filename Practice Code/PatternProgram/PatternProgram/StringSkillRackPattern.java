import java.util.Scanner;

public class StringSkillRackPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String inputStr = scanner.nextLine();
        String inputStr="SkillRack";
        
        for (int i = 0; i <= inputStr.length()/2; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < inputStr.length(); j++) {
                if (j == i || (i+j==inputStr.length()-1) ) {
                    line.append("(").append(inputStr.charAt(j)).append(")");
                } 
                else {
                    line.append(inputStr.charAt(j));
                }
            }
            System.out.println(line.toString());
        }
        
        scanner.close();
    }
}
