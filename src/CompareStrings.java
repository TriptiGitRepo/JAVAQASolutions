
public class CompareStrings {
	String strFirst = "Tripti";
	String strSecond = "Singh";
	String strThird = "tripti";
	
	public void StringCompareUsingEqualsfunction()
	{
		if(strFirst.equals(strSecond)) 
		{
			System.out.println("Following strings match : " + strFirst +", "+ strSecond +".");
		}
		else 
		{
			System.out.println("Following strings don't match : "+ strFirst +", "+ strSecond +".");
		}
		
		if(strFirst.equals(strThird))
		{
			System.out.println("Following strings match : "+ strFirst +", "+ strThird +"." );
		}
		else 
		{
			System.out.println("Following strings don't match : "+ strFirst +", "+ strThird +"." );
		}
		
		if(strFirst.equalsIgnoreCase(strThird)) 
		{
			System.out.println("Following strings match : "+ strFirst +", "+ strThird +"." );
		}
		else
		{
			System.out.println("Following strings don't match : "+ strFirst +", "+ strThird +"." );
		}
		
	}
	
	
	

}
