//Final class can't be extended

final class AB
{
	int x=10;
	
	public void m1()
	{
		x=100;
		System.out.println(x);
	}
}

//class CD extends AB
//{
//	 This will give compile time error
//}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AB ab=new AB();
        ab.m1();
	}

}
