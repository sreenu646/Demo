package sreenu.corejava.oops;

class Super
{
	int a=90;
}
public class Super_Test extends Super
{
   int a;
   static int b;
   public void m1()
   {
	System.out.println(super.a+"---------"+this.b);
   }
   public static void main(String[] args) {
	 Super_Test t1=new Super_Test();
	 t1.m1();
}
}

