class ExponentialValue 
{
	public static void main(String[] args) 
	{
		int base = 2;
		int power = 5;
		int exp = 1; // 2, 4, 8, 16, 32.
		for(int i = 1; i <= power; i++)
		{
			exp = exp * base;
		}
		System.out.println("2^5 : " +exp);
	}
}
