package Basic_Problems;
import java.io.*;
import java.util.*;
public class Angry_Professor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int t=0;t<n;t++)
		{
			int no_of_std=sc.nextInt();
			int limit=sc.nextInt();
			int came=0;
			int late=0;
			for(int i=0;i<no_of_std;i++)
			{
				int person=sc.nextInt();
				if(person<=0)
				{
					came++;
				}
				else
				{
					late++;
				}
			}
			if(came>=limit)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}

}
