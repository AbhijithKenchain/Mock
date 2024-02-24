package mock.javaPrograms;

import org.testng.annotations.Test;

public class HighestOccurenceInArray {

	
	@Test
	public void oc()
	{
		int a[]= {4,9,9,8,8,8,5,7,7,7,7,9};
		int max=0;
		int val=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
		
		if(max<count)
		{
			max=count;
			val=a[i];
		}
	}
		System.out.println(val+" "+max);
	}
}
