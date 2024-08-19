class MagicNumber 
{
	public static void main(String[] args) 
	{
		int number = 28;
		int sum = 0;
		while(number > 9)
		{
			while(number > 0)
			{
				int ld = number % 10;
				sum = sum + ld;
				number = number / 10;
			}
			number = sum;
			sum = 0;
		}
			if(number == 1)
				System.out.println("Given number is a magic number.");
			else
				System.out.println("Given number is not a magic number.");
	}
}
