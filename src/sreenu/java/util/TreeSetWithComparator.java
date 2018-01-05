package sreenu.java.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {
public static void main(String[] args) {
	CustomizedSorting c=new CustomizedSorting();
	TreeSet treeSet=new TreeSet(c);
	treeSet.add(100);
	treeSet.add(10);
	treeSet.add(100);
	treeSet.add(20);
	treeSet.add(12);
	System.out.println(treeSet);
	ArrayList arrayList=new ArrayList();
	arrayList.addAll(treeSet);
	System.out.println(arrayList);
	System.out.println(arrayList.get(1));
	System.out.println(arrayList.get(arrayList.size()-1));
	System.out.println(arrayList.get(3));
	} 
}
class CustomizedSorting implements Comparator
{
 // public int compare(Object o1,Object o2)
  //{
	//  Integer a=(Integer)o1;
	  //Integer b=(Integer)o2;
	  //return -a.compareTo(b);
	public int compare(Object o1,Object o2)
	{
		Integer a=(Integer)o1;
		Integer b=(Integer)o2;
		return -a.compareTo(b);
  }
  
}
