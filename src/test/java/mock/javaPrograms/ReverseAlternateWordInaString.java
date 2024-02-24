package mock.javaPrograms;

import org.testng.annotations.Test;

public class ReverseAlternateWordInaString {
	
	
	
	@Test
	public void jhfjhfj()
	{
		String s = "this is Java programming questions";
		
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(i%2!=0)
			{
				for(int j=s1[i].length()-1;j>=0;j--)
				{
					System.out.print(s1[i].charAt(j));
				}
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(s1[i]+" ");
			}
		}
	}

}
