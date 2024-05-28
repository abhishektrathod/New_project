package controlFlow_Statements;

public class Nested_If_Else {

	public static void main(String[] args) {
		
		int Marks=70;
		if(Marks>=75)
		{
			System.out.println("First class with destinction");
			
		}
		else if(Marks>=60 && Marks<75)
		{
			System.out.println("First class");
		}
		else if(Marks>=50 && Marks<60)
		{
			System.out.println("second Class");
		}
		else if(Marks>=35 && Marks<50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
