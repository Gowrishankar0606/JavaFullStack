package one.index;

import java.util.Arrays;
import java.util.List;

public class ArraytoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array input
		
		String players[]= {"virat","Sachin","Dhoni"};
		//Printing the array elements
		System.out.println("The array is :"+Arrays.toString(players));
		//converting array into collection 
		List<String> playersList=Arrays.asList(players);
		System.out.println("Converted Array element is"+playersList);
	}

}
