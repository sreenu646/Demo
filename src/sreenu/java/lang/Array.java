package sreenu.java.lang;

public class Array {
public static void main(String[] args) {
	int[] a=new int[7];
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	a[0]=21;
	a[1]=24;
	a[2]='A';
	//a[21]=12;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
