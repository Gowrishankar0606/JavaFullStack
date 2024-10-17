package one.index;

import java.util.HashMap;

public class Hashmapone {

	public static void main(String[] args) {
		//Hashmap is a part of map interface and you can access it by an index. 
		//key value pair one as key and other ass value
		//all data saved in the hash table or temp table 
		//it allow to store null keys
		//it is un synchronised 
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Welcome",1);
		hm.put("Wel",2);
		hm.put("come",3);
		System.out.println("Hash Map values"+hm);
		
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.put("Hai",1);
		hm1.put("Hello",2);
		hm1.put("Hamko",3);
		System.out.println("Hash Map values1"+hm1);
		
		
		//put all values in secondmap
		hm1.putAll(hm);
		System.out.println("All values:"+hm1);
		
		//changing the elements 
		hm.put("welcome to java world",1);
		System.out.println("updated values after remove "+hm);
		
		//checking the key is present if it is print the value
		
	}

}
