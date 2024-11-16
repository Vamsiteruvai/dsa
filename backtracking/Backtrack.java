package com.backtracking;

public class Backtrack {
	private static void printRecurr(String string, String perm) {
		if(string.length()==0) {
			System.out.println(perm);
			return;
		}
		
		for(int i=0;i<string.length();i++) {
			char str=string.charAt(i);
			String newstr=string.substring(0,i)+string.substring(i+1);
			printRecurr(newstr, perm+str);
		}
		
	}
	
	public static void main(String[] args) {
		String string="abc";
		
		printRecurr(string,"");
	}

	

}
