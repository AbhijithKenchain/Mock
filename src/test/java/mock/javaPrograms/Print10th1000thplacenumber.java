package mock.javaPrograms;

import org.testng.annotations.Test;

public class Print10th1000thplacenumber {
	
	
	@Test
	public void fjhfkje()
	{
		int a=123456;
		int n=1;
		while(n<=1000)
		{
			int rem=a%10;
			System.out.println("number in "+n+"th position is  "+rem);
			a=a/10;
			n=n*10;
			
		}
	}

}
