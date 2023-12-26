package SkillRack;
import java.util.*;
public class TwoPrimesSum {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		boolean flag=false;
		int firstPrime=0;
		for(int i=2;i<N;i++) {
			if(N%i!=0) {
				firstPrime=i;
				flag=true;
				break;
			}
		}
		for(int j=firstPrime;j<N;j++) {
			if(N%j!=0) {
				if((firstPrime+j)==N) {
					System.out.print(firstPrime+" "+j);
					break;
				}
			}
		}
		if(!flag) {
			System.out.print("-1");
		}

	}
}
