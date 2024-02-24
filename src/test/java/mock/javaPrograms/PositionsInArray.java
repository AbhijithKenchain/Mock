package mock.javaPrograms;



import java.util.ArrayList;
import java.util.HashMap;
import org.testng.annotations.Test;
public class PositionsInArray {


		
		@org.testng.annotations.Test
		public void array()
		{
			int a[]= {4,5,6,7,8,6,9};
			int position=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					
					if(a[i]==a[j])
					{
					position=position+j;
					System.out.println(a[j]+" repeated at  "+position+"^th position");
						}
					}
				
				
			}
		
			
		}
		
		
		@Test
		public void allpositions()
		{
			int a[]= {4,5,6,7,8,9,4,6,8,4};
			
			boolean[]b=new boolean[a.length];
			
			for(int i=0;i<a.length;i++)
			{
				if(b[i]==false)
				{
					int count=1;
					String position="";
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]==a[j])
						{
							count++;
							position=position+(j+1)+",";
							b[j]=true;
							
						}
					}
					if(count>1)
					{
						System.out.println(a[i]+"repeated at"+position+"");
					}
				}
			}
			
		}
		
		@Test
		public void arrai()
		{
			int a[]= {4,5,6,7,8,6,9,4,6,4};
			ArrayList<Integer> al=new ArrayList<Integer>();
			HashMap <Integer,String>hm=new HashMap<Integer,String>();
			for(int i=0;i<a.length;i++)
			{
			
				if(al.contains(a[i]))
				{
					if(hm.get(a[i])==null)
					hm.put(a[i], ""+(i+1));
					else
						hm.put(a[i],hm.get(a[i])+","+(i+1));
					//if null can be printed
					//System.out.println(a[i]+"repeated at position at "+(i+1));
				}
				else
				{
					al.add(a[i]);
				}
			}
		System.out.println(hm);
			
		}
	}



