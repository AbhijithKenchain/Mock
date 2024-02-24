package mock.javaPrograms;

import org.testng.annotations.Test;

public class StringSwappingLoop {

	
	@Test
	public void rr()
	{
		String s="i am from bangalore";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String fword=s1[0];
			for(int j=1;j<s1.length;j++)
			{
			s1[j-1]=s1[j];
			
			System.out.print(s1[j]+" ");
			}
			s1[s1.length-1]=fword;
			System.out.println(fword);
			
			
		}
		
		
		
	}
	@Test
	public void fkjrh()
	{
		String s="i am going to chennai city";
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String fword=s1[0];
			
			for(int j=1;j<s1.length;j++)
			{
				s1[j-1]=s1[j];
				System.out.print(s1[j]+" ");
			}
			s1[s1.length-1]=fword;
			System.out.println(fword);
		}
	}
}
