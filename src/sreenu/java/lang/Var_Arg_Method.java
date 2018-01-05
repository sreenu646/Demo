package sreenu.java.lang;
class A
{
	public void m1()
	{
		System.out.println("no-arg method");
	}
	public void m1(String s)
	{
		System.out.println("1 argument:"+s);
	}
	public void m1(String... s)
	{
		System.out.println("var-arg");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
public class Var_Arg_Method {
public static void main(String[] args) {
	A a=new A();
	a.m1();
	a.m1("hi hello");
	a.m1("hello","hi","hw r u");
}
}
