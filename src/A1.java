import java.util.Scanner;

public class A1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String To Reverse:");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rs="";
		for(int i=0;i<ch.length;i++)
		{
			int j=0;
			while(i<ch.length)
			{
				i++;
			}
			int k=i-1;
			while(k>=j)
			{
				rs=rs+ch[k];
				k--;
			}
			System.out.println(rs);
		}
	}
}
