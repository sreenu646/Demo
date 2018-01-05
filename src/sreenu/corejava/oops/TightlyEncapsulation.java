package sreenu.corejava.oops;

public class TightlyEncapsulation {
 private int a=90;
 private String name="Rama";
 public int getA()
 {
	 return a;
 }
 public String getName()
 {
	 return name;
 }
 class B extends TightlyEncapsulation
 {
	 int c=90;
 }
 class D extends TightlyEncapsulation
 {
	 private int a=70;
 }
}
