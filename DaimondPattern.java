import java.util.Scanner;

public class DaimondPattern {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++)
		{
			int k=i<=n?n-i:i-n;
			for(int j=1;j<=k;j++)
			{
				System.out.print(" ");
			}
			int s=i<=n?2*i-1:2*(2*n-i)-1;
			for(int m=1;m<=s;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}