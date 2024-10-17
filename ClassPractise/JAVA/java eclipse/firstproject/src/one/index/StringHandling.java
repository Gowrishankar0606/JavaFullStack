package one.index;

import java.util.Arrays;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is a class and the sequaence of chacter.
		//All strings are objects of a predefinded class named strings.
		
		//to find the length of string
		String type="Hello";
		System.out.println("Mystring is "+type);
		int length=type.length();
		System.out.println("Mystring length is:"+length);
		
		//concatidation 
		
		String str1="hai";
		String str2=" I am";
		System.out.println(str1+str2);
		String JoinedString=str1.concat(str2);
		System.out.println("Concated String is: "+JoinedString);
		
		boolean result=str1.equals(str2);
		System.out.println("String are not equal");
		
		//create a string using new keyword
		
		String str3=new String("Hai i am string using new:");
	
		int result1=str1.compareTo(str3);
		System.out.println(result1);
				
				//CompareTo method is used to compare two string lexigo graphically (in the dictionary )unique code
				//Equals method campare objects for equality and returns to objects are equal or false if they are not
		
		//indexof returns the occurances of the string
		
		String str5="Hai i am string ";
				int result2=str5.indexOf("i");
				int result4=result2+1;
				System.out.println(result4);
				
				//Split method is java splits a given string into an array of substring based on pattern delimiter
		String text1="Html is the programing languae";
		//Split string from space
		
		String[] resultany=text1.split("");
		System.out.println("result:");
		for(String strany:resultany)
		{
			System.out.println(strany+",");
		}
		
		//split--1.regex(div the string)
		//2.limit--no of resulting substring
		
		String vowels="a::b::c::d:e";
		//Splitting the string ::
		//Storing the result in the array
		
		String[] resultvowel=vowels.split("::");
		//Converting array to string and printing it 
		System.out.println("rsult:"+Arrays.toString(resultvowel));
		
		//replace the text or char with the given text
		
		String str6="Hai bat and ball";
		System.out.println(str6.replace('b','h'));
		
		String substringresult="Welcome to java world";
		System.out.println(substringresult.substring(4,6));
		
		String substringresult1="Welcome to java world";
		System.out.println(substringresult1.substring(4));
		
		String str10="w3resource.com";
		int result10=str10.codePointAt(0);
		int result11=str10.codePointAt(10);
		System.out.println(result10);
		System.out.println(result11);
		
		//trim is used to remove the unwanted space
		
		String s1="       Learn Programing";
		String s2="Learn Programing";
		
		System.out.println(s1.trim());
		System.out.println(s2.charAt(5));
				
	}

}
