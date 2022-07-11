
//Final methods can't be overridden
class P
{
	public void m1()
	{
		System.out.println("This is m1() method present in Class P");
	}
	
	public void m2()
	{
		System.out.println("This is m2() method present in Class P");
	}
}

class Q extends P
{
	public void m1()
	{
		System.out.println("Now this m1() method redefined in Class Q");
	}
	
	public void m2()
	{
		System.out.println("Now this m2() method redefined in Class Q");
	}
}
public class FinalMethods {
	
	public static void main(String args[])
	{
//		Q obj=new Q(); //Will give result of class Q
//		obj.m1();
//		obj.m2();
		
		P obj=new P(); //Will give result of class P
		obj.m1();
		obj.m2();
				
//		P obj=new Q(); //Will give result of class Q
//		obj.m1();
//		obj.m2();
	}

}
