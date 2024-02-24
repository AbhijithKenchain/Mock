package mock.javaPrograms;

import org.testng.annotations.Test;

public class ASCIIDuplicate {
	
	
	@Test
	public void gjh()
	{
		String h="zAAAAAAAfgaDFzkGdyyy";
		char[] s1 = h.toCharArray();
		char max=s1[0];
	char repeat=s1[0];
		
		int maxcount=0;
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
			if(max<s1[i])
			{
				max=s1[i];
				
			}
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					count++;
				}
			}
			if(maxcount<count)
			{
				if(maxcount>count)
				{
					break;
				}
				else
				{
				maxcount=count;
				repeat=s1[i];
				}
			}
			}
		
		System.out.println(max);
		System.out.println(repeat +" "+maxcount);
		
	
		
		
	}

}
