package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrintNumbersBetween20divby2 {
	
	
	@Test
	public void hg()
	{
		int n=20;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
