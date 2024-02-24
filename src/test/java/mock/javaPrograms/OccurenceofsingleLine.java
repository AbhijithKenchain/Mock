package mock.javaPrograms;

import org.testng.annotations.Test;

public class OccurenceofsingleLine {
	
	
	@Test
	public void gfhfhf()
	{
		String d="aabbcettrrraaee"; 
		int count=1;
		
		for(int i=0;i<d.length()-1;i++)
		{
			if(d.charAt(i)==d.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.print(d.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(d.charAt(d.length()-1)+""+count);
	}

}
