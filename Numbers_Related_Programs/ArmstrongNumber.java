import java.util.Scanner;
/*An Armstrong number, also known as a narcissistic number or pluperfect number, is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Let's take an example:

In a 3-digit number (like 153), each digit is raised to the power of 3 (since there are three digits), and then summed together.

For instance: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

Hence, 153 is an Armstrong number.*/
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