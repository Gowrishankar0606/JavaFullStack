package one.index;
import java.util.Hashtable;

public class HashTableImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//hash table is a data structure array of bucket it stores the key value pair and implement hashing techniues
	//it is recommented to use the map interface such as hashmap or concarent  hash map  instead of hash table class
		//initial size specified by initial capacity default load factor is 0.75 
		//no duplication key in hashmap
		
		Hashtable<Integer,String> hastab=new Hashtable<Integer,String>();
		
		//Storing the values 
		hastab.put(10,"ten");
		hastab.put(20,"Twenty");
		hastab.put(30,"Thirty");
		
		//displaying the hashmap
		System.out.println("hash map tables"+hastab);
		//Checking the values 
		
		System.out.println("Checking the values:"+hastab.contains("ten"));
		
		//update the values 
		hastab.put(10, "ten only");
		System.out.println("Updated hash tables:"+hastab);
		
		//removing the item
		hastab.remove(10);
		System.out.println("After removing an item :"+hastab);
		
		//check the particular key values in the present 
		System.out.println("Check the key values in the present:"+hastab.containsKey(20));
		System.out.println("Updated hash map:"+hastab);
		
	}

}
