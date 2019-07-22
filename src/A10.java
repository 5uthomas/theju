import java.util.Scanner;

public class A10 
{
public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String st=sc.nextLine();
			System.out.println("Enter the character");
			char st1='a';
			char name[]=st.toCharArray();
			int count;
			for(int i=0;i<name.length;i++)
			{
				count=1;
				for(int j=i+1;j<name.length;j++)
				{
					if(name[i]==name[j])
					{
						count++;
						name[j]='\0';
					}
				}
				if(name[i]==st1&&name[i]!='\0')
				{
					System.out.println(name[i]+" is Repeated "+count+" times");
				}
			}
		}
}
