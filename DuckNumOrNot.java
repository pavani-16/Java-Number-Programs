class DuckNumOrNot 
{
	public static void main(String[] args) 
	{
		int number = 237180;
		boolean isDuckNum = false;
		while(number > 0)
		{
			int ld = number % 10;
			if(ld == 0){
				isDuckNum = true;
				break;
			}
			number = number / 10;
		}
		if(isDuckNum == true)
		System.out.println("Given number is Duck number");
		else
			System.out.println("Given number is not a duck number");
	}
}
