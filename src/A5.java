import java.util.Scanner;

public class A5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String To Find Length:");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count++;	
		}
		System.out.println(count);
	}
}
