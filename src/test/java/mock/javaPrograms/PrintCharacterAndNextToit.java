package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrintCharacterAndNextToit {
	
	//input: "aabcbbdeaa"
	//output: aa ab bc bb de ea aa;
	@Test
	public void hj()
	{
		
		
		String input = "aabcbbdeaa";
		
		for(int i=0;i<input.length()-1;i++)
		{
			System.out.print(input.charAt(i)+""+input.charAt(i+1)+" ");
		}
	}

}
