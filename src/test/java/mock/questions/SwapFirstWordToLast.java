package mock.questions;

import org.testng.annotations.Test;

public class SwapFirstWordToLast {
	
	@Test
	public void s()
	{
		String s="welcome to expleo";
		
		String[] s1 = s.split(" ");
		
		String f=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=f;
		
		for(String w:s1)
		{
			System.out.print(w+" ");
		}
	}
	

}
