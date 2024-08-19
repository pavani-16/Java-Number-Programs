class NthPrimeNumber 
{
	public static void main(String[] args) 
	{
		int n = 3; 
		int num = 1;
		int count = 0;
		int i;
		while(count<n)
		{
			num++;
			for(i = 2; i<=num; i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				count++;
			}
		}
		System.out.println(num);
	}
}
