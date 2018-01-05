package sreenu.java.lang;

public class StringDemo {
public static void main(String[] args) {
	String s="hello123456";
	String s1="9177791453,087568922,919177791453,123456789,123456,789999";
	String[]s2=s1.split(",");
	for(int i=0;i<s2.length;i++)
	{
		System.out.println(s2[i]);
	}
	System.out.println(s.charAt(3));
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.substring(1));
	System.out.println(s.substring(2,8));
	//System.out.println(s.indexOf());
	System.out.println(s.contains(s1));
	
}
}
