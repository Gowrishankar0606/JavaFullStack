package Task.index;

public class Book {

	
	String title,author;
	int price;
	
	Book()
	{
		title="Java Full Stack";
		author="Mohana Priya";
		price=100;
	}
	
	public Book(String title, String author) {
        this.title = title;
        this.author = author;
        
    }
	public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
	
	public void display() {
		
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: Rs:"+price);
	}
	public static void main(String[] args) {
		
		Book GS=new Book();
		GS.display();
		
		Book GS1=new Book("Css Tutorial","RAM");
		GS1.display();
		
		Book GS2=new Book("HTML Tutorial", "BHARATH",150);
		GS2.display();
		
		
	}

}
