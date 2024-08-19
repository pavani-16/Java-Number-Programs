import java.util.Scanner;
class AmicableOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int number2 = sc.nextInt();
		for(int i = 1; i < number1; i++){
			if(number1 % i == 0){
			sum1 = sum1 +i;
			}
		}
		System.out.println("sum1 : " +sum1);
		for(int i = 1; i < number2; i++){
			if(number2 % i == 0){
			sum2 = sum2 +i;
			}
		}
		System.out.println("sum2 : " +sum2);	
		if((number1 == sum2) && (number2 == sum1)){
			System.out.println("Amicable");
		}
		else{
			System.out.println("Not a Amicable");
		}
	}
}
