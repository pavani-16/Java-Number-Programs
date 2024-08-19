class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int number = 153;
		int temp = number;
		int count = 0;
		int sum = 0;
		while(number > 0)
		{
			count++;
			number = number / 10;
		}
		number = temp;
		while(number > 0)
		{
			int ld = number % 10;
			int exp = 1;
			for(int i = 1; i<=count; i++)
			{
				exp = exp * ld;
			}
			sum = sum + exp;
			number = number / 10;
		}
		if(sum == temp)
			System.out.println("Given number is armstrong number.");
		else
			System.out.println("Given number is not a armstrong number.");
	}
}
