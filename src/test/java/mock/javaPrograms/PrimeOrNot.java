package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrimeOrNot {

	@Test
	public void fkjhk() {
		int a = 7;

		int count = 0;
		for (int i = 1; i <=a; i++) {

			if (a % i == 0) {
				count++;
			}
		}

		if (count == 2)
			System.out.println("given num is prime  " + a);
		else
			System.out.println("not a prime " + a);

	}

	@Test
	public void whileloop() {
		int a = 97;
		int b = 1;
		int count = 0;
		while (b <= a) {
			if (a % b == 0) {
				count++;
			}
			b++;

		}
		if (count == 2) {
			System.out.println("given is prime " + a);
		} else {
			System.out.println("not a prime   " + a);
		}

	}
	
	
	
	@Test
	public void fgjjj()
	{
		int a=349;
		
		int count=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("given is a prime "+a);
		}
		else
		{
			System.out.println("not a prime no "+a);
		}
	}
	
	@Test
	public void fjhj()
	{
		int a=99;
		int b=1;
		int count=0;
		while(b<a)
		{
			if(a%b==0)
			{
				count++;
			}
			b++;
		}
		if(count==1)
		{
			System.out.println("prime  "+a);
		}
		else
		{
			System.out.println("not prime "+a);
		}
	}

}
