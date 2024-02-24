package mock.javaPrograms;

import org.testng.annotations.Test;

public class SumOfFirst3MinNumbers {
	
	@Test
	public void gg()
	{
		int a[]={7, -6, 11, 9, 0, 4};
		
		for(int i=0;i<a.length-1;i++)
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
		System.out.println();
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
