package sreenu.java.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateValuesDemo {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList();
	arrayList.add(10);
	arrayList.add(20);
	arrayList.add(10);
	System.out.println(arrayList);
	HashSet hashSet=new HashSet(arrayList);
	System.out.println(hashSet);	
	HashSet hashSet1=new HashSet();
	hashSet1.addAll(arrayList);
	System.out.println(hashSet1);
	HashSet h=new HashSet();
	for(int i=0;i<arrayList.size();i++)
	{
		Object o=arrayList.get(i);
		h.add(o);
		
	}
	System.out.println(h);
	LinkedHashSet linked=new LinkedHashSet();
	for(int i=0;i<arrayList.size();i++)
	{
		Object o=arrayList.get(i);
		boolean b=linked.add(o);
		if(b==false)
		{
			System.out.println(" duplicates are:"+o);
		}
		
	}
}
}