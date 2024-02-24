package mock.javaPrograms;

import org.testng.annotations.Test;

public class SortZeroAtLast {
	
	
	@Test
	public void ghj()
	{
		int a[]= {1,0,2,0,3,0};
		int count=1;
		
		for(int b:a)
		{
			if(b==0)
			{
				count++;
			}
			else 
			{
				System.out.print(b+",");
			}
			
			
		}
		while(count>1)
		{
			System.out.print(0 +",");
			count--;
			
		}
		
		
	}

}
