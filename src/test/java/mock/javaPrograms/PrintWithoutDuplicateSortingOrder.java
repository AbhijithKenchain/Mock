package mock.javaPrograms;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class PrintWithoutDuplicateSortingOrder {
	
	
	@Test
	public void jug()
	{
		String d="gdyuhudh";
		
		TreeSet<Character>ts=new TreeSet<Character>();
		
		for(int i=0;i<d.length();i++)
		{
			ts.add(d.charAt(i));
		}
		System.out.println(ts);
	}
}
