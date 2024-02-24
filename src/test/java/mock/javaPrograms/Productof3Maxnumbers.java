package mock.javaPrograms;

import org.testng.annotations.Test;

public class Productof3Maxnumbers {

	
	@Test
	public void e()
	{
		int a[]= {8,6,2,5,9,10};
		
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
			System.out.print(a[i]+" ");
			
		}
		int product=1;
		for(int i=0;i<3;i++)
		{
			product=product*a[i];
			
		}
		System.out.println();
		System.out.println(product);
	}
	
}
