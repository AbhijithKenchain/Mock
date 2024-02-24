package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrintMissingNumbers {

	
	@Test
	public void print()
	{
		int arr[]= {1,2,5};
		
		for(int i=1;i<=10;i++)
		{
			
			boolean found=false;
			for(int j=0;j<arr.length;j++)
			{
 				if(arr[j]==i)
				{
					found =true;
					break;
				}
			}
			if(!found)
			{
				System.out.print(i+" ");
			}
		}
	}
}
