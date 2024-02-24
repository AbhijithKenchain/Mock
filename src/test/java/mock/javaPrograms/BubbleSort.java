package mock.javaPrograms;

import org.testng.annotations.Test;

public class BubbleSort {
	
	@Test
	public void ghj()
	{
		int a[]= {8,3,9,10,2,11};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
