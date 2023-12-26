package classesAndObjects;

class student{
	String name;
	String rollno;
	float[] mark=new float[3];
	
	student(String n,String r,float m1,float m2,float m3) {
		name=n;
		rollno=r;
		mark[0]=m1;
		mark[1]=m2;
		mark[2]=m3;
	}
	
	float avgmark() {
		float a=(mark[0]+mark[1]+mark[2])/mark.length;
		return a;
		
	}
}

public class StudentClass {
    public static void main(String[] args) {
		student s1=new student("Anand P","20D105",88,79,97);

		System.out.println("The name of stuent 1 is "+s1.name);
		System.out.println("The roll no of stuent 1 is "+s1.rollno);
		System.out.println("The average mark of stuent 1 is "+s1.avgmark()); //invoking 
	}
}
