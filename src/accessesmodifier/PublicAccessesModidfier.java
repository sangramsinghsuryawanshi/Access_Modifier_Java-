package accessesmodifier;

class A
{
	public int a1=10;
	protected int a2=12;
	void run()
	{
		System.out.println(" Protected: "+a2);
	}
}
class B extends A
{
	void di()
	{
		System.out.println("Public: "+a1);
	}
}
public class PublicAccessesModidfier 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.di();
		b1.run();

	}

}
