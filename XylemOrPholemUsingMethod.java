import java.util.Scanner;
class XylemOrPholemUsingMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value.");
		int num = sc.nextInt();
		if(sumOfFdAndLd(num)==sumOfMd(num))
		{
			System.out.println("Given number is Xylem number");
		}
		else
		{
			System.out.println("Given number is pholem number.");
		}
	}
	public static int sumOfFdAndLd(int num)
	{
		int sum = 0;
		int ld = num % 10;
		sum = sum + ld;
		while(num>9)
		{
			num = num / 10;
		}
		sum = sum + num;
		return sum;
	}
	public static int sumOfMd(int num)
	{
		int sum = 0;
		num = num / 10;
		while(num>9)
		{
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;
		}
		return sum;
	}
}
