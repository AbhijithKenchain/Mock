package mock.javaPrograms;

import org.testng.annotations.Test;

public class PalindromeNumber {
	
	@Test
	public void gfjj()
	{
		int a=12221;
		int sum=0;
		int temp;
		temp=a;
	while(a>0)
	{
		int rem=a%10;
		sum=(sum*10)+rem;
		a=a/10;
		
	}
	if(temp==sum)
	{
		System.out.println("palindrome"+ sum);
	}
	else
	{
		System.out.println("not a palindrome "+ sum);
	}
	
	}

}
