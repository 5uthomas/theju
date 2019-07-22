import java.util.Scanner;

public class A7
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your sentence!");
			String sen=sc.nextLine();
			System.out.println("Enter your word you searching for!");
			String wordpart=sc.nextLine();
			char senarr[]=sen.toCharArray();
			char wordpartarr[]=wordpart.toCharArray();
			int count=0;
			for(int i=0;i<senarr.length;i++)
			{
				int j=0;
				int k=i;
				while(k<senarr.length&&j<wordpartarr.length&&senarr[k]==wordpartarr[j])
				{
					j++;
					k++;
				}
				if(j==wordpartarr.length)
				{
					if((i==0||senarr[i-1]==' ')&&(k==senarr.length||senarr[k]==' '))
					{
						count++;
					}
				}
			}
			if(count>1)
			{
				System.out.println("yes word is duplicated and repeated in "+count+" Times");
			}
	}
}
