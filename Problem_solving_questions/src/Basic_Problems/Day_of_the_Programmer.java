package Basic_Problems;
import java.util.Scanner;
public class Day_of_the_Programmer {

	public static String getDate(int y)
	{
		if(y>=1700&&y<=1917)
		{
			if(y%4==0)
			{
				return "12.09."+y;
			}
			return "13.09."+y;
		}
		else if(y==1918)
		{
			return "26.09."+y;
		}
		else
		{
		if((y%400==0)||((y%4==0)&&(y%100!=0)))
		{
			return "12.09."+y;
		}
		return "13.09."+y;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		System.out.println(getDate(year));
	}

}
