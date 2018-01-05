package sreenu.java.util;

import java.util.HashMap;

public class HMapDynamic {
public void m1(String... s)
{
	System.out.println("var-arg");
}
public void m1(HashMap h)
{
	System.out.println(h.get("username"));
	System.out.println(h.get("password"));
}
public static void main(String[] args) {
	HMapDynamic h=new HMapDynamic();
	h.m1();
	h.m1("java");
	h.m1("hello","java");
	h.m1("hi","hello","hi");
	HashMap m=new HashMap();
	m.put("username","hello");
	m.put("password","abc123");
	h.m1(m);
}
}
