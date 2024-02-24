package mock.javaPrograms;

import org.testng.annotations.Test;

public class ReverseEachWordInString {
	
	@Test
	public void te()
	{
		String s="hi hello selenium";
		
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String str=s1[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
