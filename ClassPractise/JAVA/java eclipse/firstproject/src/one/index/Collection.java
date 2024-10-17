package one.index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//collection is the framework that is used to store and manipulate group of objects
		//iterator provides access to an element and also next element until specific condition to be satisfied
		//iterator are going in the collection for the thread safe
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Ram");
		list.add("Priya");
		list.add("Ajay");
		list.add("Malani");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(9);
		list1.add(19);
		list1.add(28);
		System.out.println(list1);
		
		
		System.out.println("index number i is:"+list1.get(1));
		
		list1.add(2,3);
		System.out.println("After inserting missed values:");
		System.out.print(list1);
		
		
		Collections.sort(list1);
		System.out.println(list1);
		
		int b=list1.size();
		System.out.println("the size is :"+b);
		
		list1.remove(1);
		System.out.println(list1);
		
		//array can hold only, objects on the index
		//so we must use the wrapper class (Integer,String,Boolean)
		//it can store null elements
	}

}
