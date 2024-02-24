package mock.javaPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class PalindromeusingIterator {
	
	@Test
	public void jhjh()
	{
		String s="nikhil";
		
		String rev="";
		LinkedList<Character>ls=new LinkedList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			ls.add(s.charAt(i));
		}
		
		
		Iterator<Character>it=ls.descendingIterator();
		
		while(it.hasNext())
		{
			rev=rev+it.next();
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		ListIterator<Character>ut=ls.listIterator();
	
		
		
		
	}

}
