package mock.javaPrograms;

import org.testng.annotations.Test;

public class NewProgram {
	
	@Test
	public void hj()
	{
		String s="hh&%dfj*qw";
		
		String s1 = s.replaceAll("[^a-zA-Z]", "");
		int count=s1.length()-1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
			
		{
			System.out.print(s1.charAt(count--));
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
		
		
	}
	
	@Test
	public void fgfh()
	{
		String d="h%a@6$gh&&yui";
		
		String s1 = d.replaceAll("[^A-Za-z]", "");
		int count = s1.length()-1;
		
		for(int i=0;i<d.length();i++)
		{
			if(d.charAt(i)>='a'&&d.charAt(i)<='z')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(d.charAt(i));
			}
		}
		
	}
	
	
	@Test
	public void fjkkjf()
	{
		String s="ga@$7n*e!s%h";
		
		
		String s1 = s.replaceAll("[^A-Za-z]", "");
		int count=s1.length()-1;
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		
		}
		System.out.println();
	}
	
	@Test
	public void hghgj() {
		 String s = "ayamalayalamkayak";
		 
		 String s1="";
		 String s2="";
		 int len=0;
		 
		 for(int i=0;i<s.length();i++)
		 {
			 s1=s1+s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				
				s1=s1+s.charAt(j);
				String rev="";
				StringBuilder f=new StringBuilder(s1);
				rev=rev+f.reverse();
				if(s1.equals(rev)&&s1.length()>len)
				{
					s2=s1;
					len=s2.length();
					
				}
				
			}
			s1="";
		 }
		 System.out.println(s2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
