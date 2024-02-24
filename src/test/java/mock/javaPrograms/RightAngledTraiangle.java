package mock.javaPrograms;

import org.testng.annotations.Test;

public class RightAngledTraiangle {
	
	
	@Test
	public void gkghg()
	
	{int n=5;
		
		for(int i=1;i<=n;i++)
		{
			char c=49;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void fhgghf()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			char ch=48;
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j<=i)
				{
					ch++;
					System.out.print(ch+" ");
				}
				else
				{
					ch--;
					System.out.print(ch+" ");
				}
			}
			System.out.println();
		}
	}

}
