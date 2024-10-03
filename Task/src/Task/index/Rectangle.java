package Task.index;

public class Rectangle {

	
	int width,height,area,perimeter;

	 Rectangle()
	 {
		 width=10;
		 height=15;
		 area=height*width;
		 perimeter=(height*width)*2;
	 }
	 
	 
	 
	 public void display() {
		 
		 System.out.println("Area of rectangle:"+area);
		 System.out.println("Perimeter of rectangle:"+perimeter);
	 }
	
	 public static void main(String args[])
	 {
		 Rectangle Gs=new Rectangle();
		 
		 Gs.display();
	 }
}
