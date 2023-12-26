package classesAndObjects;

public class Methods_prgm {
    static boolean twodigit(int a) {
		if(a>9 && a<100)
			return true;
		else
			return false;
	}
	
	static void welcome() {
		System.out.println("Welcome Buddy");
	}
	
	static int sumofdigit(int a) {
		int sum=0;
		while(a>0){
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		welcome();
		System.out.println("The given number is two digit "+twodigit(100));
		System.out.println("Sum of two digit is "+sumofdigit(2133));
	}
}
