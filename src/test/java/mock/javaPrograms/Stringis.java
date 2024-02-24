package mock.javaPrograms;

import org.testng.annotations.Test;

public class Stringis {
	
	@Test
	public void ty()
	{
		String s="this is name";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(',');
			}
		}
	}

}
