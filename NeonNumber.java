class NeonNumber 
{
	public static void main(String[] args) 
	{
		int number = 9;
		int sq = number * number; // 81
		int sum = 0;
		while(sq > 0)
		{
			int ld = sq % 10;
			sum = sum + ld;
			sq = sq / 10;
		}
		if(sum == number)
			System.out.println("Neon number .");
		else
			System.out.println("not a neon number.");
	}
}
