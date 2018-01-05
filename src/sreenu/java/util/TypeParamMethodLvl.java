package sreenu.java.util;

import java.util.ArrayList;
import java.util.HashMap;

public class TypeParamMethodLvl {
public <T> void m1(T t)
{
	System.out.println(t);
}
public static void main(String[] args) {
	TypeParamMethodLvl type=new TypeParamMethodLvl();
	ArrayList l=new ArrayList();
	l.add(10);
	l.add(24);
	l.add(35);
	type.m1(l);
	HashMap h=new HashMap();
	h.put("hello", "hi");
	h.put("java","selenium");
	type.m1(h);
	
}
}
