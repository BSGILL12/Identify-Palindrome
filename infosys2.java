import java.util.*;
import java.lang.*;

class prac41
{
	boolean palindrome(int n)
	{
		int r,sum=0,temp;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	int reverse(int n)
	{
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter any number: ");
		n=in.nextInt();
		prac41 x=new prac41();
		do
		{
			n=n+x.reverse(n);
		}
		while(x.palindrome(n)==false);
		System.out.print("Palindrome no. = "+n);
	}
}