package mock.javaPrograms;

import org.testng.annotations.Test;

public class ReversingString {
	
	
	@Test
	public void ghgjj()
	{
		String s="my name is ok";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
