package programmiz;

public class fibonacciseries 
{
	public static void main(String[] args)
	{
		int firstterm = 0;
		int secondterm = 1;
		int nextterm;
		int n=10;
		for(int i=1;i<=n;i++)
		{
			nextterm = firstterm+secondterm;
			System.out.println(nextterm);
			firstterm=secondterm;
			secondterm=nextterm;
			
		}
		
	}

}
