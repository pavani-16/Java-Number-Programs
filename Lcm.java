class Lcm 
{
	public static void main(String[] args) 
	{
		int number1 = 3;
		int number2 = 5;
		int lcm = 0;
		for(int i = number1; i <= number1 * number2; i++)
		{
			if(i % number1 == 0 && i % number2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);
	}
}
