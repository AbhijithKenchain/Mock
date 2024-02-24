package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrintInIncreasingCharacter {

	
	@Test
	public void fg()
	{
		String s="selenium";
		
		for(int i=0;i<=s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
