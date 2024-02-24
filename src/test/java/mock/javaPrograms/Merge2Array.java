package mock.javaPrograms;

import org.testng.annotations.Test;

public class Merge2Array {
	
	
	@Test
	public void hgj()
	{
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int k=0;
		int length1=a.length;
		int length2=b.length;
		int c[]=new int[length1+length2];
		
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		for(int g:c)
		{
			System.out.print(g+" ");
		}
		System.out.println();
		
		//another method for merging
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
		}
		for(int g:c)
		{
			System.out.print(g+" ");
		}
		
	}

}
