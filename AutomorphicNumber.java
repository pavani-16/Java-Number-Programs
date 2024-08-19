class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		int number = 12;
		int sq = number * number; // 25
		while(number > 0)
		{
			int ld1 = number % 10; // 5 // 2
			int ld2 = sq % 10;
			if(ld1 == ld2){ // 5 == 5
				System.out.println(" automorphic number");
				break;
			}
			else {
				System.out.println("Given number is a not a automorphic number.");
				break;
			}		
			number = number / 10;
			sq = sq / 10;
		}
		//if(sq == number)
			//System.out.println("Automorphic numner");
		//else
			//System.out.println("Given number is a not a automorphic number.");
	}
}
