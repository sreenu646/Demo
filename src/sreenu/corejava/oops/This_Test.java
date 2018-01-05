package sreenu.corejava.oops;

public class This_Test {
 int a=90;
 static int s;
 public This_Test()
 {
	 a=200;
	 s=34;
 }
 public  void m1()
 {
	 System.out.println(this.a+"====="+this.s);
 }
 public static void main(String[] args) {
	 This_Test t1=new This_Test();
	t1.m1();
}
}
