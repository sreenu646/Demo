package sreenu.corejava.oops;
class Count
{
	static int count;
	{
		count++;
	}
}
public class ObjectsCount {
	public static void main(String[] args) {
		Count a1=new Count();
		Count a2=new Count();
		Count a3=new Count();
		Count a4=new Count();
		Count a5=new Count();
		Count a6=new Count();
		
		System.out.println(a6.count);
	}


}
