class TwistedPrimeNumber 
{
	public static void main(String[] args) 
	{
		int number = 17;
		int rev = 0;
		while(number > 0)
		{
			int ld = number % 10;
			rev = rev * 10 + ld;
			number = number / 10;
		}
		int count = 0;
		for(int i = 1; i<=rev; i++)
		{
			if(rev % i == 0)
				count++;
		}
		if(count == 2)
			System.out.println("Given number is twisted prime number.");
		else
			System.out.println("Given number is not twisted number.");
	}
}
