import java.util.*;//step1
public class CA
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       float radius,area,PI=3.14f;
	   System.out.println("Enter radius of circle\n");
	   radius=xyz.nextFloat();
	   area=radius*radius*PI;
	   System.out.printf("Area of circle is %f\n",area);
   }
}