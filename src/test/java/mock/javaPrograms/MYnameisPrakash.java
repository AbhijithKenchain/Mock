package mock.javaPrograms;

import org.testng.annotations.Test;

public class MYnameisPrakash {

	
	
	@Test
	public void jk()
	{
		String s="my& na*me/ is& $pra%ka!sh";
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String str = s1[i].replaceAll("[^a-zA-Z]", "");
			int count=str.length()-1;
			
			for(int j=0;j<s1[i].length();j++)
				
			{
				if(s1[i].charAt(j)>='A' && s1[i].charAt(j)<='Z'||s1[i].charAt(j)>='a' && s1[i].charAt(j)<='z')
				{
					System.out.print(str.charAt(count--));
				}
				else
				{
					System.out.print(s1[i].charAt(j));
				}
			}
			System.out.print(" ");
		
		}
	}
	
	@Test
	public void g()
	{
		String d="my@ !na*me is# $ab@hi*jith@";
		String[] s1 = d.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String str = s1[i].replaceAll("[^A-Za-z]", "");
			 int count=str.length()-1;
			 
			 
			 for(int j=0;j<s1[i].length();j++)
			 {
				
				 if(s1[i].charAt(j)>='A' && s1[i].charAt(j)<='Z'||s1[i].charAt(j)>='a' && s1[i].charAt(j)<='z')
				 {
					 System.out.print(str.charAt(count--));
				 }
				 else
				 {
					 System.out.print(s1[i].charAt(j));
				 }
			 }
			 System.out.print(" ");
			
		}
		
		
	}
	
	
	
	
	
}
