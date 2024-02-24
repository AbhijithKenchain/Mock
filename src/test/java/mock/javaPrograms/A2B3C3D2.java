package mock.javaPrograms;

import org.testng.annotations.Test;

public class A2B3C3D2 {
	
	@Test
	public void hjhkj()
	{
		String s="a2b3c2d1";
		//o/p =aaabbbbcccdd;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				int num = s.charAt(i+1)-48;
				System.out.print(s.charAt(i));
				for(int j=0;j<num;j++)
				{
					System.out.print(s.charAt(i));
				}
			}
		}
		System.out.println();

}
}
