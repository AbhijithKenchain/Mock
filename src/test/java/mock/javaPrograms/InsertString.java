package mock.javaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class InsertString {

	public static void main(String[] args) {
		
	
	{
		String[]s= {"a","b","c","d","e"};
		
		String  insert="and";
		
		int insertindex=(s.length)/2;
		
		String []newarray=new String[s.length+1];
		
		if(s.length<0 ||insertindex>s.length)
		{
			System.out.println("index out of range");
		}
		else
		{
			newarray[insertindex]=insert;
			for(int i=0;i<s.length;i++)
			{
				if(i<insertindex)
				{
					newarray[i]=s[i];
				}
				else
				{
					newarray[i+1]=s[i];
				}
			}
			
		}
		for(String e:newarray)
		{
			System.out.print(e+" ");
		}
		
}
}
}

