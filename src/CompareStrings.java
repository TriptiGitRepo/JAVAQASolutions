import java.util.Scanner;

public class CompareStrings {
	//Defining 3 strings
	String str1 = "Tripti";
	String str2 = "tripti";
	String str3 = "Singh";
	
	
	//This function is comparing 2 strings using charAt function if the length of the strings match
	public void StringCompareWithAtChar()
	{
		int result = CompareWithAtChar(str1,str2);
		if (result == 0)
			System.out.println("Strings match!");
		else
			System.out.println("Strings do not match");
	}
	
	//Trying an int function and practicing function declaration and call
	private int CompareWithAtChar(String strFirst, String strSecond)
	{
		if(strFirst.length()==strSecond.length()) 
		{
		
			for(int i=0;i<strFirst.length();i++) 
			{
				if(Character.toLowerCase(strFirst.charAt(i))==Character.toLowerCase(strSecond.charAt(i))) 
				{
					continue;
				}
				return 1;
			}
			return 0;
		}
		return 1;
				
	}
	

	//This function is comparing 2 strings using equals function
	public void StringCompareUsingEqualsfunction()
	{
//		Option 1
//		if(str1.equals(str2)) 
//		{
//			System.out.println("Following strings match : " + str1 +", "+ str2 +".");
//		}
//		else 
//		{
//			System.out.println("Following strings don't match : "+ str1 +", "+ str2 +".");
//		}
//		
//		if(str1.equals(str2))
//		{
//			System.out.println("Following strings match : "+ str1 +", "+ str2 +"." );
//		}
//		else 
//		{
//			System.out.println("Following strings don't match : "+ str1 +", "+ str2 +"." );
//		}
//		
//		if(str1.equalsIgnoreCase(str2)) 
//		{
//			System.out.println("Following strings match : "+ str1 +", "+ str2 +"." );
//		}
//		else
//		{
//			System.out.println("Following strings don't match : "+ str1 +", "+ str2 +"." );
//		}
		
		
//		Option 2 : A better way of writing the above code 
		comparedAndPrinted("Using equals", str1.equals(str2));
		comparedAndPrinted("Using equalsIgnoreCase", str1.equalsIgnoreCase(str2));
		
//		Option 3 : With user providing the strings for comparison
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		str1 = userInput.nextLine();
		
		System.out.println("Enter second string: ");
		str2 = userInput.nextLine();
		
		comparedAndPrinted("Using equals", str1.equals(str2));
		comparedAndPrinted("Using equalsIgnoreCase", str1.equalsIgnoreCase(str2));
		
		System.out.println();
		System.out.println("Present value of str1 and str2 are : "+str1+" and "+str2+".");
		
		userInput.close();
	}

		// This method is using ternary operator
	private void comparedAndPrinted(String method, boolean areequal) 
	{
		String matchStatus = areequal ? "match": "dont match";
		System.out.println("Following strings "+ matchStatus + "(" + method + "):" + str1 + ","+ str2 + ".");
		
	}
		
}
