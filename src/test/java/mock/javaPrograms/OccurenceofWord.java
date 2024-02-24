package mock.javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccurenceofWord {
	
	@Test
	public void d()
	{
		String s = "My name is rishav it contains ri and shav is mine";
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(s1[i]+" "+count);
			}
		}
	}
	@Test
	public void usingmap()
	{
		String s = "My name is rishav it contains ri and shav is mine";
		
		LinkedHashMap<String,Integer>hm=new LinkedHashMap<String, Integer>();
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
		if(hm.containsKey(s1[i]))
		{
			hm.put(s1[i], hm.get(s1[i])+1);
		}
		else
		{
			hm.put(s1[i], 1);
		}
		}
		for(Entry<String, Integer> map:hm.entrySet())
		{
			if(map.getValue()>=1)
			{
				System.out.println(map.getKey()+" "+map.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
