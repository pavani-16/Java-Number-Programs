class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		// Reference variables.
		int a = 0;
		int b= 1;
		// series start with 0.
		int sum = 0;
		for(int i = 1; i <= 10; i ++)
		{
			System.out.println(sum);
			a = b; 
			b = sum;
			sum = a + b;
		}
	}
}
