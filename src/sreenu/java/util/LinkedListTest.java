package sreenu.java.util;

import java.util.LinkedList;

public class LinkedListTest {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(10);
	l.add(1,"hello");
	l.addFirst(12);
	//l.clone(1,23);
	System.out.println(l);
}
}
