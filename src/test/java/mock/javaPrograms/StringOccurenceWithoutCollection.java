package mock.javaPrograms;

import org.testng.annotations.Test;

public class StringOccurenceWithoutCollection {
	
	
	@Test
	public void hjjh()
	{
		String s="auto test";
		
		for(int i=0;i<s.length();i++)
		{int count=0;
			
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&s.charAt(i)!=' ')
				{
					if(i>j)
					{
						break;
						
					}
					else
					{
						count++;
					}
				}
			}
		
		if(count>=1)
		{
			System.out.println(s.charAt(i)+" "+count);
		}
		}
	}

}
