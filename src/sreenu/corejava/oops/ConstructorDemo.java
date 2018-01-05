package sreenu.corejava.oops;
class ConstructorOne
{
	int a;
	 String s;
	 public ConstructorOne(int a,String s)
	 {
		this.a=a;
		 this.s=s;
	 }
	 public void display()
	 {
		 System.out.println(a+"-------------"+s);
	 }
}
public class ConstructorDemo {
 public static void main(String[] args) {
	ConstructorOne c1=new ConstructorOne(89,"java");
	c1.display();
	ConstructorOne c2=new ConstructorOne(90,"selenium");
	c2.display();
}
 }
