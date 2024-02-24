package mock.javaPrograms;

import org.testng.annotations.Test;

public class PrintOnlyNumbersInreverse {
	
	
	
	@Test
	public void jkdhhj()
	{
		String s="2ghjf23uijk789pi99";
		String[] sp = s.split("[A-Za-z]");
		boolean flag=false;
		for(int i=sp.length-1;i>=0;i--)
		{
			if(!sp[i].equals("")&& flag)
			{
				System.out.print(","+sp[i]);
			}
			else if(!sp[i].equals(""))
			{
				
				System.out.print(sp[i]);
				flag=true;
			}
			
		}
	}
	
	@Test
	public void kjfhfkj()
	{
		
		String s="Tekion234inter52view54";
		String[] sp = s.split("[A-Za-z]");
		System.out.print(sp[sp.length-1]);
		
		for(int i=sp.length-1;i>=0;i--)
		{
			
			if(sp[i]!="")
			{
				System.out.print(","+sp[i]);
			}
		}
		System.out.println();
		
		//in forward
		for(int i=0;i<sp.length-1;i++)
		{
			
			if(sp[i]!="")
			{
				System.out.print(sp[i]+",");
			}
		}
		System.out.print(sp[sp.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
