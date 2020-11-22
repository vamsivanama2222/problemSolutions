package Basic_Problems;
import java.util.Scanner;
public class Chocolate_Feast {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int p=0;p<t;p++)
		{
			int rs=sc.nextInt();
			int price=sc.nextInt();
			int offer=sc.nextInt();
			int chioces=0;
			int wrappers=0;
			chioces=rs/price;
			wrappers=chioces;
			while(wrappers>=offer)
			{
				int c=(wrappers/offer);
				wrappers=wrappers%offer;
				chioces+=c;
				wrappers+=c;
				//System.out.println(chioces+"--"+wrappers);
			}
			System.out.println(chioces);
		}

	}

}
