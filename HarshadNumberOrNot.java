class HarshadNumberOrNot 
{
	public static void main(String[] args) 
	{
		int number = 27;
		int temp = number;
		int sum = 0;
		while(number > 0)
		{
			int ld = number % 10;
			sum = sum + ld;
			number = number / 10;
		}
		if(temp % sum == 0)
			System.out.println("Given number is Harshad number ");
		else
			System.out.println("Given number is not a harshad number. ");
	}
}
