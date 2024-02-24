package mock.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class TwoMaps {

	@Test
	public void fgh() {

		LinkedHashMap<Integer, HashMap> lh = new LinkedHashMap<Integer, HashMap>();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm1.put(2, "two");
		hm2.put(3, "three");
		hm3.put(4, "four");

		lh.put(5, hm);
		lh.put(6, hm1);
		lh.put(7, hm2);
		lh.put(8, hm3);

		System.out.println(lh.entrySet());

	}

	
	
	@Test
	public void substringRepeated()
	{
		String s="ABDEFGABEF";
		int count=0;
		String value="";
		for(int i=0; i<s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
				String s1=s.substring(i, j);
				if(count<s1.length())
				{
					count=s1.length();
					value=s1;
					
				}
			}
		}
		}
		System.out.println(value);
		
	}
}
