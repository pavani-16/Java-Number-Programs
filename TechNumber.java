class TechNumber 
{
	public static void main(String[] args) 
	{
		int number = 2025;
		int temp = number;
		int count = 0;
		while(number > 0)
		{
			count ++;
			number = number / 10;
		}
		if(count % 2 == 0)
		{
			int exp = 1;
			for(int i = 1; i <= count / 2; i++)
			{
				exp = exp * 10;
			}
			int sum = 0;
			int firstHalf = temp / exp;
			sum = sum + firstHalf;
			int secondHalf = temp % exp;
			sum = sum + secondHalf;
			int sq = sum * sum;
			if(sq == temp)
			System.out.println("Given number is a tech number.");
		else
			System.out.println("Given number is not a tech number.");
		}
		else
			System.out.println("Given number con't be divided into equal parts.");

	}
}
