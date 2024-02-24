package mock.javaPrograms;

import org.testng.annotations.Test;

public class OccurenceOfWordInString {

	
	
	@Test
	public void tes()
	{
		String s="hi hello hi hello bye tyss off";
		
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
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
		System.out.println(s1[i]+" "+count);
		}
		
		
		
		
	}
	@Test
	public void test()
	{
		String s="this is india";

		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' ')
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
			System.out.print(s.charAt(i)+"="+count+" ");
		}
	}
}
