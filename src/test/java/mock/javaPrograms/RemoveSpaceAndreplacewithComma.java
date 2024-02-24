package mock.javaPrograms;

import org.testng.annotations.Test;

public class RemoveSpaceAndreplacewithComma {
	
	
	@Test
	public void ghhgj()
	{
		String s="this is an example";
		String[] st = s.split(" ");
		String rev="";
		for(int i=0;i<st.length;i++) {
			if (i!=st.length-1) {
				rev=rev+st[i]+",";
			} else {
				rev=rev+st[i];
			}
		}
		System.out.println(rev);
		
		
		
	}

}
