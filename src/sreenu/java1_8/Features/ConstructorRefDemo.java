package sreenu.java1_8.Features;
@FunctionalInterface
interface i3<T>
{
	T getTest();
}
class A{public void m1(){
	System.out.println("A class m1()");
}}
class B{public void m2(){
	System.out.println("B class M2()");
}}
public class ConstructorRefDemo {
	public static void main(String[] args) {
		i3<A>i=A::new;
		A a=i.getTest();
		 a.m1();
		i3<B>i2=B::new;
		B b=i2.getTest();
		b.m2();
		
	}

}
