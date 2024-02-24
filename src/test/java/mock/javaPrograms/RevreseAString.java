package mock.javaPrograms;

import org.testng.annotations.Test;

public class RevreseAString {
	
	
	@Test
	public void rev()
	{
		String s="abhijith";
		
		String q="";
		for(int i=s.length()-1;i>=0;i--)
		{
			q=q+s.charAt(i);
		}
		System.out.print(q);
		
	}
	
	@Test
	public void hh()
	{
		String s="abhijith";
		char[] chr = s.toCharArray();
		String des="";
		for(int i=chr.length-1;i>=0;i--)
		{
			des=des+chr[i];
		}
		System.out.print(des);
	}

}
