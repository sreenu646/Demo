package sreenu.java.lang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateEle {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(10);
	a.add(10);
	a.add(20);
	System.out.println(a);
	//one way remove
	HashSet hashSet=new HashSet(a);
	System.out.println(hashSet);
	//second
	HashSet h=new HashSet();
	h.addAll(a);
	System.out.println(h);
	//third
	HashSet h1=new HashSet();
	for(int i=0;i<a.size();i++)
	{
		Object o=a.get(i);
		h1.add(o);
		
	}
	System.out.println(h1);
	//fourth
	LinkedHashSet l=new LinkedHashSet();
	for(int i=0;i<a.size();i++)
	{
		Object o=a.get(i);
		boolean b=l.add(o);
		if(b)
		{
			System.out.println("No Duplicates");
		}
		else
		{
			System.out.println("it is duplicate element:"+o);
		}
	}
	
}
}
