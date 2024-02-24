package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrintNumbersWithComma {
	
	@Test
	public void f()
	{
		String s="aa44bb78cc963dd56";
		String[] s1 = s.split("[A-Za-z]");
		
		for(int i=0;i<s1.length-1;i++)
		{
			if(!s1[i].equals(""))
			{
				System.out.print(s1[i]+",");
				
			}
		}
		System.out.print(s1[s1.length-1]);
		
		
		
	}
	
	@Test
	public void g()
	{
		System.out.println();
		String s="aa44bb78cc963dd56";
		String [] s2=s.split("[A-Za-z]");
		
		for(int i=s2.length-1;i>=3;i--)
		{
			if(!s2[i].equals(""))
			{
				
			System.out.print(s2[i]+",");
			}
		}
		System.out.print(s2[2]+" ");
		
	}

}
