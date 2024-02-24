package mock.javaPrograms;

import org.testng.annotations.Test;

public class IncreasingSpace {
	
	
	@Test
	public void hjgj() {
		
		String s="Abhijith";
		
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i));
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			
		}
		System.out.print(s.charAt(s.length()-1));
	}

}
