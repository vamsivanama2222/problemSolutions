package Basic_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Picking_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			List<Integer> current =new ArrayList<Integer>();
			int k=0;
			current.add(arr[i]);
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(Math.abs(arr[j]-arr[i])<=1)
					{
						boolean enter=true;
						for(int p=0;p<current.size();p++)
						{
							if(Math.abs(current.get(p)-arr[j])>1)
							{
								enter=false;
							}
						}
						if(enter==true)
						{
							current.add(arr[j]);
						}
					}
				}
			}
			//System.out.println(current.size());
			if(current.size()>max)
			{
				max=current.size();
			}
		}
		System.out.println(max);
	}

}
