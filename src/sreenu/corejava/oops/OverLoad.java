package sreenu.corejava.oops;
class OverLoadTest
{
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println("int,int");
		return c;
	}
	public float add(int a,float b)
	{
		float c=a+b;
		System.out.println("int,float");
		return c;
	}
	public double add(float a,double b)
	{
		double c=a+b;
		System.out.println("float,double");
		return c;
	}
}
public class OverLoad {
public static void main(String[] args) {
	OverLoadTest o=new OverLoadTest();
	o.add(10,20);
	o.add(12.9f,20.0);
	o.add(10,10.5f);
}
}
