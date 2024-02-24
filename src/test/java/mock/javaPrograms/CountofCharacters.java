package mock.javaPrograms;

import org.testng.annotations.Test;

public class CountofCharacters {
	
	@Test
	public void tt()
	{
		String s="aweexxxyyyyyy";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
