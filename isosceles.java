import java.util.*;
class area {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("enter your number:"+a);
		System.out.println("enter your number:"+b);
		
		double area=(b/4)*Math.sqrt((4*a*a)-(b*b));
		System.out.println("area of rhombus:"+area);
	}
}
		