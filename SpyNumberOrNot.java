class SpyNumberOrNot 
{
	public static void main(String[] args) 
	{
		int number = 1236;
		int sum = 0;
		int product = 1;
		while(number > 0)
		{
			int ld = number % 10;
			number = number / 10;
			sum = sum + ld;
			product = product * ld;
		}
		if(sum == product)
			System.out.println("spy number");
		else
			 System.out.println("not a spy number");
	}
}
