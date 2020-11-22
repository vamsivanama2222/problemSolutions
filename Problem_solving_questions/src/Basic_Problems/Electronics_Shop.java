package Basic_Problems;
import java.util.Scanner;
public class Electronics_Shop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] key=new int[a+1];
		int[] mouse=new int[b+1];
		for(int i=0;i<a;i++)
		{
			key[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++)
		{
			mouse[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if((key[i]+mouse[j])<=n)
				{
					if((key[i]+mouse[j])>max)
					{
						max=key[i]+mouse[j];
					}
				}
			}
		}
		if(max==0) {
			max=-1;
		}
		System.out.println(max);
	}

}
