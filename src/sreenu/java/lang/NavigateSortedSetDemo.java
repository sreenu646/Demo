package sreenu.java.lang;

import java.util.ArrayList;



public class NavigateSortedSetDemo {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(10);
	a.add(100);
	a.add(100);
	a.add(1000);
	System.out.println(a.hashCode());
	for(int i=0;i<a.size();i++)
	{
		Object d=a.get(i);
		System.out.println("HS:"+d.hashCode());
		//Number n=new Number();
	}
}
}
