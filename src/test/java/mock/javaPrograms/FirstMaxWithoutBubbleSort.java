package mock.javaPrograms;

import org.testng.annotations.Test;

public class FirstMaxWithoutBubbleSort {
	
	@Test
	public void rr()
	{
		int []a= {7,-3,0,2,1,-9};
		int fmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}
		}
		System.out.println(fmax);
		
	}
	
	@Test
	public void secondMax()
	{
		int []a= {7,-3,0,2,1,-9};
		int fmax=0;
		
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=smax;
			fmax=a[i];
		}
		else if(a[i]>smax)
		{
			smax=a[i];
		}
	}
		System.out.println(smax);
	}
}
