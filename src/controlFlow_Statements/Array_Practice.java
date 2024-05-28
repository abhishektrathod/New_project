package controlFlow_Statements;

import java.util.Arrays;

public class Array_Practice {

	public static void main(String[] args) {
		
		String s[]={"Krishna", "Balram", "Gaur", "Nitai"};
		s[0]="Govind";
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		
		try
		{
		System.out.println(s[4]);
		}
		catch(Exception e)
		{
			System.out.println("Take it from string");
			System.out.println(s.length);
			
			System.out.println(Arrays.toString(s));
		}
		
		//by using each loop
		for(String p:s)
			System.out.println(p);
		
		{
			
		}
	}

}
