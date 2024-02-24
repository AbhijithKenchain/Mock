package mock.javaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CombinationAndPositionThroughCollection {
	
	
	@Test
	public void jkghj()
	{
		
		int a[]= {1,7,3,1,9,4,6,4,1};
		
		
		LinkedHashMap<Integer, Integer>map=new LinkedHashMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer>map1=new LinkedHashMap<Integer, Integer>();
	
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==10)
				{
					if(!map.containsKey(a[i])==true && !map.containsKey(a[j])==true)
					{
						map.put(a[i], a[j]);
						map1.put(i, j);
					}
				}
			}
		}
		
		for(Entry<Integer, Integer> m1:map.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		for(Entry<Integer, Integer> m1:map1.entrySet())
		{
			System.out.println("positions are "+"i is in "+m1.getKey()+" "+"j is in "+m1.getValue());
		}
		
	}

}
