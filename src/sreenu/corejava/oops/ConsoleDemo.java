
package sreenu.corejava.oops;

import java.util.Scanner;

public class ConsoleDemo {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner s=new Scanner(System.in);
	String value=s.next();
	System.out.println("After reading values from console is:" +value);
	System.out.println("Enter a number");
	float f=s.nextFloat();
	System.out.println("After reading values from console is:" +f);
	System.out.println("enter a double value");
	double d=s.nextDouble();
	System.out.println("After reading values from console is:"+d);
	
}
}
