package mock.javaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class SubstringandremoveduplicateCollection {
	
	
	@Test
	public void hh()
	{
		String s="abhijith";
		System.out.println(s.substring(0, 2));
		System.out.println();
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> map:hm.entrySet())
		{
			System.out.print(map.getKey()+" ");
		}
	}

}
