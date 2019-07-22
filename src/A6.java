import java.util.Scanner;

public class A6 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String st=sc.nextLine();
		countWords(st);
	}

	private static void countWords(String st)
	{
		char ch[]=st.toCharArray();
	    int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(i<ch.length && ch[i]==' ')
			{
				count++++++;
			}	
		}
		 System.out.println("Total words :"+count);
		
		
	}
}
