import java.util.Scanner;

public class ArmstrongNumber 
{
	public static boolean  armstrongNumber(int n)
	{
		int rem ,n1 = n,n2=n;
		int count =0,arm=0;
		while(n>0)
		{
			rem = n%10;
			n = n/10;
			count ++;
		}
		while(n1>0)
		{
			rem = n1 %10;
			arm = arm+power(rem,count);
			n1 = n1/10;
		}
		if(arm==n2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int power(int n,int pow)
	{
		int square=1;
		for(int i=1;i<=pow;i++)
		{
			square *=n;
		}
		
		return square;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		sc.close();
		if(armstrongNumber(n))
		{
			System.out.println("This Given Number is Armstrong Number");
		}
		else
		{
			System.out.println("Given Number is not Armstrong Number");
		}
	}

	
}