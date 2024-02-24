package mock.javaPrograms;

import org.testng.annotations.Test;

public class StringExtractNumber {
	
	@Test
	public void hkjnj()
	{
		String s="I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
		String s1 = s.replaceAll(" ", "");
		//System.out.println(s1);
		String[] s2 = s1.split("[A-Za-z]");
		
		for(int i=0;i<s2.length-1;i++)
		{
			if(s2[i]!="")
			{
			System.out.print(s2[i]+"*");	
			}
		}
		System.out.println(s2[s2.length-1]);
		
		
		
	}

}
