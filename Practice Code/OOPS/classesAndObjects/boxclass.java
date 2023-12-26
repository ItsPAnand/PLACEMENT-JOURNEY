package classesAndObjects;


class Box{
	int length,height,width;  //instance variable
	
	Box(int l,int h,int w){   //constructor  there is no return for constructor Its name is to be same as class name
		length=l;                 
		height=h;
		width=w;
	}
	
	Box(){
		this.length=-1;                 
		this.height=-1;
		this.width=-1;
	}
	
	Box(int i) {
		length=height=width=i;
	}
	
	void setDime(int l,int h,int w) {  //this pointer it means it takes the value from which object is invoking
		this.length=l;                 
		this.height=h;
		this.width=w;
	}
	
	int surfacearea() {
		return 2*length*width+2*length*height+2*width*height;
	}
	
	int cube() {
		return length*height*width;
	}
}


public class boxclass {
    public static void main(String[] args) {
		Box b1=new Box(19,12,9);            //we cannot change that bcz it is initially  
		//b1.setDime(10, 7, 3);               //for changing the object value 
		int a=b1.surfacearea();             //invoking the method
		System.out.println("The surface area of box 1 is "+a);
		
		Box b2=new Box();
		System.out.println("The no parameter argument is "+ b2.surfacearea());
		
		Box b3=new Box(8);
		System.out.println("The cube of the third box is "+b3.cube());
	}
}
