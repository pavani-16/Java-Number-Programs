class BouncyNumber 
{
	public static void main(String[] args) 
	{
		int num = 8765 ;
		int rev = 0;
		int rev1=0;
		int temp = num;
		for(int i = 1; i<=9;i++)
		{
			num= temp;
			while(num>0)
			{
				int ld = num%10;
				if(ld==i)
					rev = rev*10+ld;
				num/=10;
			}
		}
		for(int i = 9; i>=1;i--)
		{
			num= temp;
			while(num>0)
			{
				int ld = num%10;
				if(ld==i)
					rev1 = rev1*10+ld;
				num/=10;
			}
		}
		if(temp==rev)
			System.out.println("not a bouncy number");
		else if(temp == rev1)
			System.out.println("not a bouncy number");
		else
			System.out.println("bouncy number");
	}
}
