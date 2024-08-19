class Hcf 
{
	public static void main(String[] args) 
	 {
		int number1 = 8; // Factors of 8.
		int number2 = 12;// Factors of 12
		int hcf = 0;
		for(int i = 1; i <= number1; i++)
		 {
			if(number1 % i == 0 && number2 % i == 0)
				hcf = i;
		 }
		System.out.println(hcf);
	}
}
