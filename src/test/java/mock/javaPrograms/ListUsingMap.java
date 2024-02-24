package mock.javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ListUsingMap {
	
	
	
	
	@Test
	public void hjkkjg()
	{
		List<String >l=new  ArrayList<String>();
		l.add("amma");
		l.add("byjoy");
		l.add("lisa");
		l.add("kevin");
		l.add("amman");
		
		TreeSet<String>t=new TreeSet<String>();
		t.addAll(l);
		System.out.println(t);
	}

	
}
