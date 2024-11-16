package com.String;

import java.lang.invoke.StringConcatException;
import java.util.Arrays;

public class Strings {
	//Accessing the random elements
	public static void accessing(String str1,char key) {
		int i=0;
		while(i<str1.length()) {
			if(key==str1.charAt(i)) {
				System.out.println("key is found at index :"+i);
			}
			i++;
		}System.out.println("not found");
	}
	
	//Inserting the elements
	public static void insert(String ele,String ele1) {
		String str2=ele+ele1;
		System.out.println("the element is :"+str2);
	}
	
	//Modifying a character in a String
//	public static void modify(String str4,char modify,String ele) {
//		String dataString=null;
//		for(int i=0;i<str4.length();i++) {
//			if(modify==str4.charAt(i)) {
//				dataString= str4.replace(modify,ele);
//			}
//		}System.out.println(dataString);
//	}
	
	//deleting of character in string
	public static void deletion(StringBuilder str3,char element ) {
		StringBuilder dataString=null;
		for(int i=0;i<str3.length();i++) {
			if(element==str3.charAt(i)) {
				dataString=str3.deleteCharAt(i);
			}
		}System.out.println(dataString);
	}
	
	public static int comparing(String str5,String str6) {
		return str5.compareTo(str6);
	}
	public static void main(String[] args) {
		//accessing the random elements
//		String str1="Geeks";
//		accessing(str1, 'v');
		
		//Inserting an character in the String
//		insert("vamsi"," krishna");
		
		//Modifying a character in a string
//		String str3="geek";
//		String str4="geeks";
//		modify(str4,'g',"for");
		
		//deletion character in a string
//		StringBuilder sBuilder=new StringBuilder("geekforgeeks");
//		deletion(sBuilder,'k');
		
		//concatenating strings
		String str5="vamsi";
		String str6="vanu";
		
		if(comparing(str5,str6)==0) {
			System.out.println("both are same");
		}else {
			System.out.println("not same");
		}		
	}

}
