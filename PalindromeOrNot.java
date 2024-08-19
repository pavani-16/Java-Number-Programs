class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		int number = 232;
		int reverse = 0;
		int temp = number;
		while(number > 0)
		{
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}
		if(temp == reverse)
			System.out.println("Palindrome number");
		else 
			System.out.println("not a Palindrome number");
	}
}
