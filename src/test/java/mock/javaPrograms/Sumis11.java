package mock.javaPrograms;

import org.testng.annotations.Test;

public class Sumis11 {
	
	@Test
	public void Dg()
	{
		int []a={1,3,5,2,8,9,10} ;
		int sum=11;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+"  + "+a[j]+" sum is 11");
				}
			}
		}
	}

}
