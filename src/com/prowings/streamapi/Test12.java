package com.prowings.streamapi;

public class Test12 {

	public static void main(String[] args) {
		
		String str="India is My Country";
		String[]s=str.split(" ");
		//String rev=" ";
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		//	rev+=s[i]+" ";
		}
		//System.out.println(rev);
	
	}
}
