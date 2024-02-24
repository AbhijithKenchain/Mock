package mock.javaPrograms;

import org.testng.annotations.Test;

public class VowelsInNameString {
	
	
	@Test
	public void dhgdf()
	{
		String[]d= {"Vijay","Vivek","jawahar"};
		
		for(int i=0;i<d.length;i++)
		{
			int count=0;
			String str=d[i];
			for(int j=0;j<str.length();j++)
			{
			if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')
			{
				count++;
			}
		}
			System.out.println(str+" "+count);
			
	}
	}
}
