package Basic_Problems;
import java.util.Scanner;
public class Beautiful_Days_at_the_Movies {

	public static int reverse(int k)
	{
		
		int sum=0;
		while(k>0)
		{
			int r=k%10;
			sum=(sum*10)+r;
			k=k/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int intial=sc.nextInt();
		int last=sc.nextInt();
		int div=sc.nextInt();
		int count=0;
		for(int i=intial;i<=last;i++)
		{
			int opt=Math.abs(i-reverse(i));
		//	System.out.println(i+"--"+reverse(i));
			if(opt%div==0)
			{
				count++;
			}
				
		}
		System.out.println(count);
	}

}
