package SkillRack;
import java.util.*;
public class fibanocciSequence {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long N=sc.nextLong();
		long n1=0,n2=1;
		int i=0;
		while(i<N) {
			System.out.print(n1+" ");
			long n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}

	}
}
