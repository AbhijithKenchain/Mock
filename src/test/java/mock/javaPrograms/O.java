package mock.javaPrograms;

public class O {
	
	public static void main(String[] args)
	{
	String s="This is from India".toLowerCase();
	int count =0;
	

	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)=='i')
	{
		count++;
	}
	}
System.out.println(count);	
}
}

