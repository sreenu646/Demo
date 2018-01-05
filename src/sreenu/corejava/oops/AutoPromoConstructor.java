package sreenu.corejava.oops;

public class AutoPromoConstructor {
	float a;
	String s;
	public AutoPromoConstructor(float a,String s)
	{
		this.a=a;
		this.s=s;
	}
	public void display()
	{
		System.out.println(a+"-----"+s);
	}
public static void main(String[] args) {
	AutoPromoConstructor t=new AutoPromoConstructor(90,"JAVA");
	t.display();
	AutoPromoConstructor t1=new AutoPromoConstructor(112,"SELENIUM");
	t1.display();
	AutoPromoConstructor t2=new AutoPromoConstructor('A',".NET");
	t2.display();
	AutoPromoConstructor t3=new AutoPromoConstructor(10.56F,"PROJECT");
	t3.display();
	AutoPromoConstructor t4=new AutoPromoConstructor('N',"PRACTICE");
	t4.display();
	
}
}
