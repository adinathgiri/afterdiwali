import java.util.*;
public class BSORTAPP
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
        int a[]=new int[5];
		boolean flag;
		System.out.println("Enter values in array\n");
		for(int i=0; i<a.length; i++)
		{
		   a[i]=xyz.nextInt();
		}
		System.out.println("Display array before sort");
		for(int i=0; i<a.length; i++)
		{
		   System.out.printf("%d\t",a[i]);
		}
		//apply bubble sort algorithm
		int count=0;
		for(int i=0; i<a.length-1; i++)
		{
		  flag=false;
		  for(int j=0; j<a.length-i-1; j++)
		  {   ++count;
		      if(a[j]>a[j+1])
			  {  int temp = a[j];
			     a[j]=a[j+1];
				 a[j+1]=temp;
				 flag=true;
			  }
		  }
		  if(!flag)
		  { break;
		  }
		}
   System.out.println("\nDisplay array after sorting");
		for(int i=0; i<a.length; i++)
		{
		   System.out.printf("%d\t",a[i]);
		}
		System.out.printf("Counter is %d\n",count);
   }
}