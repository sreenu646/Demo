package sreenu.java1_8.Features;

public interface WithoutClassPrint {
public static void m1()
{
	System.out.println("m1");
}
public static void main(String[] args) {
	m1();
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
	}
}
}
