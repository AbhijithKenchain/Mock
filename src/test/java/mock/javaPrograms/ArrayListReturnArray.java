package mock.javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

import org.testng.annotations.Test;

public class ArrayListReturnArray {
	
	@Test
	public void hj()
	{
		ArrayList<Integer> g=new ArrayList<Integer>();
		
		g.add(15);
		g.add(16);
		g.add(19);
		
int a[]=new int[g.size()];
for(int i=0;i<a.length;i++)
{
	a[i]=g.get(i);
	System.out.print(a[i]+" ");
}
System.out.print(g);

HashSet<Integer>h=new HashSet<Integer>();
h.addAll(g);
System.out.print(h);

	}

}
