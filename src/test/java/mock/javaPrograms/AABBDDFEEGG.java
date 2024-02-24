package mock.javaPrograms;

import org.testng.annotations.Test;

public class AABBDDFEEGG {
	
	@Test
	public void f()
	{
		String a="aaabbcdddffyy";
		int count=1;
		for(int i=0;i<a.length()-1;i++)
		{
			
			if(a.charAt(i)==a.charAt(i+1))
			{
				count++;
				
			}
			else
			{
				System.out.print(a.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(a.charAt(a.length()-1)+""+count);
	}
	
	@Test
	public void kj()
	{
		String s="welcome to tyss";
		
		String[] s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}


