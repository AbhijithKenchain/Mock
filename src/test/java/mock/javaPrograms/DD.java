package mock.javaPrograms;

import org.testng.annotations.Test;

public class DD {
	
	@Test
	public void t()
	{
		int a[]= {22,22,7,8,9,5,10,10,11,11};
		int fmax=a[0];
		int smax=a[1];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				if(a[i]!=fmax)
				smax=a[i];
			}
			
		}
		System.out.println(smax);
	}

}
