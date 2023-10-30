package com.sunbeam;

public class TestStringConversion {

	public static void main(String[] args) {
		
		//1
		String s1 = "Bank Of Maharashtra";
		String[] parts=s1.split(" ");
		String s2="";
		for(String part :parts)
			s2= s2+ part.charAt(0);
		System.out.println("Bank Of Maharashtra --> "+s2);
		
		//2
		String s3 = "this is string";
		String[] parts1 = s3.split(" ");
		String s4="";
		for(String part : parts1)
			s4= s4 + part.toUpperCase().charAt(0)+ part.substring(1) +" ";
		System.out.println("this is string -->" +s4);
		
		//3
		String s5 = "Example";
		String s6="";
		for(int i=0;i<s5.length();i++)
		{
			if(i%2==0)
				s6+=s5.substring(i,i+1).toLowerCase();
			else
				s6+=s5.substring(i,i+1).toUpperCase();
		}
			System.out.println("Example --> "+s6);
			
		//4
		String s7="www.sunbeaminfo.com";
		s7= s7.replace(".com", ".in");
		System.out.println("www.sunbeaminfo.com --> "+s7);
				
	}

}
