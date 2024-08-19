class MegaPrimeNumber 
{
	public static void main(String[] args) 
	{
		int number = 53;
		while(number > 0)
		{
			int ld = number % 10; // 1
			int count = 0;
			for(int i = 1; i<=ld; i++)
			{
				if(ld % i == 0)
					count++;
			}
			number = number/ 10;
			if(count == 2)
				System.out.println("megaprime number.");
			else
				System.out.println("not a megaprime number.");
		}
	}
}
