package sreenu.corejava.oops;
class FourTest
{
	int a;
	float b;
	String s;
	public FourTest()
	{
		System.out.println("default Constructor");
	}
	public FourTest(int a)
	{
		this.a=a;
		System.out.println("int parameter constructor"+a);
	}
	public FourTest(float b,String s)
	{
		this.b=b;
		this.s=s;
	}
	public FourTest(int a,float b,String s)
	{
		this.a=a;
		this.s=s;
		this.b=b;
		
	}
}
public class ConstructorOverloading {
 public static void main(String[] args) {
	FourTest f=new FourTest();
	FourTest f1=new FourTest(90);
	System.out.println("HashCode"+f.hashCode());
}
}
