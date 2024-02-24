package mock.javaPrograms;

import org.testng.annotations.Test;

public class RepeatedAtpositionsArray {
	
	
	@Test
	public void hghg()
	{
		 int[] a={10,20,30,40,10,20,60,70,60, 30,10,20,10};
	       boolean[] b=new boolean[a.length];
	       for(int i=0;i<a.length;i++){
	           if(b[i]==false){
	               int count=0;
	               String repeat="";
	               for(int j=i+1;j<a.length;j++){
	                   if(a[i]==a[j]){
	                       count++;
	                       b[j]=true;
	                       repeat=repeat+(j+1)+",";
	                   }
	               }
	               if(count>0){
	                   System.out.println(a[i]+" is repeated at "+repeat+ " positions");
	               }
	           }
	       }
	    /*   for(int i=0;i<a.length;i++){
	           if(b[i]==true){
	               System.out.println(a[i]+" is a repeated number present at "+(i+1)+" position");
	           }*/
	       
	    }
	}
