package mock.javaPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AnagramOrNot {
	
	
	@Test
	public void ana()
	{
		
		String s="amma";
		String s1="mama";
		
		char[] arr1 = s.toCharArray();
		char[] arr2 = s1.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 
		 if(Arrays.equals(arr1, arr2))
		 {
			 System.out.println("string is anagram");
		 }
		 else
		 {
			 System.out.println("not anagram");
		 }
	}

}
