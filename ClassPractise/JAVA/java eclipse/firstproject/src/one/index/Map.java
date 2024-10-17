package one.index;

import java.util.HashMap;
import java.util.*;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map is a interface storing values based on key/values pairs
		//There are three types of maps tree map, hash map, Linked hash map
		//key is the unique identifier used to associate each element values in a map
		//value is an element associated by the keys in a map
		
		Map<String,Integer> numbers=new HashMap();
		//Insert Element to the map
		//number put (1.,"one")
		
		numbers.put("one",1);
		numbers.put("two",2);
		System.out.println("map"+numbers);
		
		//Access key
		System.out.println("Keys"+numbers.keySet());
		
		//access values of the map
		System.out.println("values"+numbers.values());
		
		//access the entries of the map
		System.out.println("Enteries"+numbers.entrySet());
		
		//remove element from the map
		
		int value=numbers.remove("two");
		System.out.println("Before removing "+numbers);
		System.out.println("Removed")
	}

}
