package sreenu.java1_8.Features;
interface i
{
	default void m1()
	{
		System.out.println("m1:i");
	}
}
interface j
{
	default void m1()
	{
		System.out.println("m1:j");
	}
}
public class AvoidAmbuiguty implements i,j {
public void m1()
{
	System.out.println("class:m1");
	i.super.m1();
	j.super.m1();
}

public static void main(String[] args) {
	AvoidAmbuiguty a=new AvoidAmbuiguty();
	a.m1();
	j j=new AvoidAmbuiguty();
	j.m1();
	
	
}
}
