package mock.javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occurenceinput {

	@Test
	public void dd()
	{
		int a=122322;
		LinkedHashMap<Integer, Integer>hm=new LinkedHashMap<Integer, Integer>();
		while(a>0)
		{
			int rem=a%10;
			if(hm.containsKey(rem))
			{
				hm.put(rem, hm.get(rem)+1);
			}
			else
			{
				hm.put(rem, 1);
			}
			a=a/10;
		}
		for(Entry<Integer, Integer> map:hm.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}
