package mock.javaPrograms;

import org.testng.annotations.Test;

public class OccurenceOfCharacterInString {

	
	@Test
	public void t()
	{
		String s="aabbccdddeef";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
			count++;
			
			}
			else
			{
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);	
		
	}
	
	@Test
	public void jk()
	{
		String s="malayalam";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
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
			if(count==1)
			System.out.println(s.charAt(i)+":"+count);
		}
	}
}
