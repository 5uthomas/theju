
public class A2 
{
	public static void main(String[] args)
	{
		String myStr = "ANJU"; 
		String reversed = reverseString(myStr);
		System.out.println("Original String is: "+myStr);
		System.out.println("The reversed string is: " + reversed);
		
	}
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty())
		{	
		 return myStr;
		}
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
}
