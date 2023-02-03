import java.util.Scanner;
class ArrowPattern
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=2*n;i++)
		{
			int k=i<=n?2*(n-i):2*(i-n);
			for(int j=0;j<=k;j++)
			{
				System.out.print(" ");
			}
			int l=i<=n?i:2*n-i;
			for(int a=0;a<=l;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}