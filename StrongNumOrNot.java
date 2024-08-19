class StrongNumOrNot 
{
	public static void main(String[] args) 
	{
		int number = 146;
		int temp = number;
		int sum = 0;
		while(number > 0)
		{
			int lastDigit = number % 10;
			int product = 1;
			for(int i = 1; i<=lastDigit; i++)
			{
				product = product * i;
			}
			number = number / 10;
			sum = sum + product;
		}
		if(sum == temp)
			System.out.println("Given number is a strong number.");
		else
			System.out.println("Given number is not a strong number.");
	}
}
