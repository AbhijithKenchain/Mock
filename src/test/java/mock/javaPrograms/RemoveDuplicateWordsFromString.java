package mock.javaPrograms;

import org.testng.annotations.Test;

public class RemoveDuplicateWordsFromString {
	
	
	@Test
	public void te()
	{
		String s="hi hello hi hello kitty";
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
	{
	System.out.print(s1[i]+" ");
	}
	
}
		
		
}
}
