package mock.javaPrograms;

import org.testng.annotations.Test;

public class MultiplyThreeMaxNumbers {

	
	
	@Test
	public void highest()
	{
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.print(a[i]+"");
		}
		System.out.println();
		int product=1;
		
		for(int i=0;i<3;i++)
		{
			product=product*a[i];
		}
		System.out.println(product);
		
	}
}
