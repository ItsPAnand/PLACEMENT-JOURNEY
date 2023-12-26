package classesAndObjects;

class User{
	String name,id,password;
}

class Book{
	String bookname,author;
	double price;
}

public class classesLibrary {
    public static void main(String[] args) {
		User p1=new User();
		Book b1=new Book();
		p1.name="Anand";
		p1.id="Userno : 0001";
		p1.password="*****";
		
		b1.author="no one";
		b1.bookname="Game of Thrones";
		b1.price=10000;
		
		System.out.println("The user name is "+p1.name);
		System.out.println("The user ID is "+p1.id);
		System.out.println("The user password is "+p1.password);
		System.out.println("The book name is "+b1.bookname);
		System.out.println("The book author is "+b1.author);
		System.out.println("The book price is "+b1.price);
	}
}
