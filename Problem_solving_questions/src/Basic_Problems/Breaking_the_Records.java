package Basic_Problems;
import java.util.Scanner;

public class Breaking_the_Records {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int intial=sc.nextInt();
		int high=intial;
		int more=0;
		int less=0;
		int low=intial;
		for(int i=1;i<n;i++)
		{
			int score=sc.nextInt();
			if(score>high)
			{
				more++;
				high=score;
			}
			if(score<low)
			{
				less++;
				low=score;
			}
		}
		System.out.println(more+" "+less);

	}

}
