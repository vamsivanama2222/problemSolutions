package Basic_Problems;
import java.util.Scanner;

public class Bill_Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int amt=sc.nextInt();
			if(i!=p)
			{
				sum=sum+amt;
				//System.out.println(sum);
			}
		}
		int actual=sc.nextInt();
		int cal=sum/2;
		//System.out.println(sum+"---"+cal);
		if(actual==cal)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(actual-cal);
		}

	}

}
