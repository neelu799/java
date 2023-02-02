import java.util.Scanner;
class HollowBoxPattern
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				if(i==1 || j==1 || i==n || j==k || i==j || i+j==((n+k)/2)+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}