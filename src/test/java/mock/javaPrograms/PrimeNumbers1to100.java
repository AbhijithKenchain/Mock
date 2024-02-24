package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrimeNumbers1to100 {
	
	@Test
	public void rr()
	{
	
	
	for(int i=1;i<=100;i++)
	{
		boolean flag=false;
		for(int j=2;j<=i/2;j++) {
			if (i%j==0) {
				flag=true;
				break;
			}
		}
		if (!flag && i!=1) {
			System.out.println(i);
		}
	}

}
	
	
	@Test
	public void ff()
	{int count=0;
		for(int i=1;i<=100;i++)
		{
			boolean flag=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
				if(!flag &&i!=1)
				{
					count++;
					System.out.println(i);
				}
			}
		System.out.println("no os primes "+count);
		
	}
}
