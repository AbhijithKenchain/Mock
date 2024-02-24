package mock.javaPrograms;

import org.testng.annotations.Test;

public class SegeregateAllTypes {
	
	
	@Test
	public void special()

	{
		String s="abhi123!@#";
		String num=" ";
		String ch=" ";
		String sp=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' &&s.charAt(i)<='z')
			{
				ch=ch+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				 num=num+s.charAt(i);	
			}
			else
			{
				sp=sp+s.charAt(i);
				
			}
		
		}
		System.out.println("char"+ch);
		System.out.println("nu,bers"+num);
		System.out.println("special characters are "+sp);
		
	}
}
