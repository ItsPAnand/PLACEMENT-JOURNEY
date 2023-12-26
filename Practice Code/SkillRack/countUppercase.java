package SkillRack;

public class countUppercase {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="FDFD";
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
			}
		}
		System.out.print(count);

	}
}
