package SkillRack;
import java.util.*;
public class simpleEncryption {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the message to Encrypt");
		String message=scan.nextLine();
		System.out.println("Enter the Encrypt key");
		int shift=scan.nextInt();
		char msgArr[]=message.toCharArray();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<msgArr.length;i++) {
			int index=(i+shift)%msgArr.length;
			result.append(message.charAt(index));
		}
		System.out.println(result);
	}

}
