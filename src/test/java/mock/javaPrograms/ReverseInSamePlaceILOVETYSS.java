
package mock.javaPrograms;

import org.testng.annotations.Test;

public class ReverseInSamePlaceILOVETYSS {
	
	@Test
	public void reverse()
	{
		String s="i am selenium";
		//o/p="m ui nelesmai" 
		
		String s1 = s.replaceAll(" ", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
		
	}

}
