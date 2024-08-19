class SylemOrPhloem 
{
	public static void main(String[] args) 
	{
		int number = 12346;
		int sum1 = 0;
		int sum2 = 0;
		int ld = number % 10;//6
		sum1 = sum1 + ld;//0+6= 6
		number = number / 10;//1234
		while(number > 9)
		{
			 ld = number % 10;//4 , 3 , 2
			sum2 = sum2 + ld;//4 , 7 , 9
			number = number / 10;//123 ,12 , 1
		}
		//System.out.println(sum2);
		sum1 = sum1 + number; // 7
		//System.out.println(sum1);
		if(sum1 == sum2)
			System.out.println("Sylem");
		else 
			System.out.println("phloem");
	}
}
