package sreenu.java1_8.Features;
@FunctionalInterface
interface t1
{
	int getStringLength(String s);
	default void m1()
	{
		
		System.out.println("interface:m1");
		//return 8;
	}
	public static int m2(int i)
	{
		System.out.println("interface static method");
		return 10;
	}
}
public class LambdaDemo2 {
public static void main(String[] args) {
	
	t1 t=(String s)->{int c=s.length();return c;};
	int d=t.getStringLength("javaselenium");
	System.out.println(d);
	int a=t1.m2(10);
	System.out.println(a);
}
}
