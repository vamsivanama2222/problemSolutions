package Basic_Problems;
import java.util.Scanner;
public class Migratory_Birds {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		int type=0;
		for(int i=0;((i<n)&&(arr[i]>0));i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//System.out.println(arr[i]+"---"+arr[j]);
					arr[j]=-1;
					//System.out.println(arr[i]+"-------"+arr[j]);
				}
				
				
			}
			//System.out.println("---------------------");
			//System.out.println(arr[i]+"----"+count+"--"+max);
			if(count>max)
			{
		
				type=arr[i];
				max=count;
			}
		}
		System.out.println(type);

	}

}
