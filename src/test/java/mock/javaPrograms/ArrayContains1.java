package mock.javaPrograms;

import org.testng.annotations.Test;

public class ArrayContains1 {

	
	@Test
	public void hjkh()
	{
			int[] a= {10,22,41,56,101};{
				for(int i=0;i<a.length;i++) {
					int num=a[i];
					boolean flag=false;
					while(num>0) {
						int rem=num%10;
						if (rem==1) {
							flag=true;
							break;
						}
						num=num/10;
					}
					if (flag) {
						System.out.println(a[i]+" contains 1 in it");
					}
				}
			}
		}
	}


