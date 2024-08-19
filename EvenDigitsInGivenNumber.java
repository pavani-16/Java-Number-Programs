class EvenDigitsInGivenNumber 
{
	public static void main(String[] args) 
	{
		int number = 123456;
		while(number > 0){
			int lastDigit = number % 10;
			number = number / 10;
			if(lastDigit % 2 == 0){
		System.out.println(lastDigit);
			}
		}
	}
}
