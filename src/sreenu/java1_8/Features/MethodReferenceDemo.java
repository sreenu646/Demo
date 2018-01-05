package sreenu.java1_8.Features;
@FunctionalInterface
interface MethodRef
{
	void m1();
}
public class MethodReferenceDemo {
public void m8()
{
	System.out.println("1");
	System.out.println("1");
	System.out.println("333");
}
public static void main(String[] args) {
	MethodReferenceDemo mdr=new MethodReferenceDemo();
	MethodRef ref=mdr::m8;
	ref.m1();
}
}
