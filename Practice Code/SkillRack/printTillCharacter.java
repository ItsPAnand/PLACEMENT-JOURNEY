package SkillRack;

public class printTillCharacter {
    public static void main(String[] args) {
		String ip="gkajgdgkj";
		char ch='A';
		char arr[]=ip.toCharArray();
		int i=0;
		while(i<ip.length()) {
			if(arr[i]!=ch) {
				System.out.print(ip.charAt(i));
			}
			else {
				break;
			}
			i++;
		}

	}
}
