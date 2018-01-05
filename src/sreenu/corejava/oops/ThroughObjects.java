package sreenu.corejava.oops;

public class ThroughObjects {
  int a;
  String s;
  public static void main(String[] args) {
	ThroughObjects a1=new ThroughObjects();
	System.out.println(a1.a+"--------------"+a1.s);
	a1.a=100;
	a1.s="sreenu";
	System.out.println(a1.a+"-------------"+a1.s);
	ThroughObjects a2=new ThroughObjects();
	a2.a=200;
	a2.s="Hello";
	System.out.println(a2.a+"----------------"+a2.s);
	ThroughObjects a3=new ThroughObjects();
	System.out.println(a3.a+"----------------"+a3.s);
	
}
}
