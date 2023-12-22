package Matrix;
import java.util.Scanner;
public class M1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order");
        int a=sc.nextInt();
        int sum=1;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
			System.out.println(sum);
	}
}
