interface sample
{
	public void displayone();

}
interface sample2 extends sample
{
	public void displaytwo();
	default void displaysmg(){
		System.out.println("default of interface 2 printed");
	}
}

class demointer implements sample2
{
	demointer()
	{
		System.out.println("default");
	}
	@Override
	public void displayone(){
		System.out.println("Method from interface one");
	}
	@Override
	public void displaytwo(){
		System.out.println("Method from interface two");
	}

}
class demointerface
{
	public static void main(String ads[])
	{
		demointer s1=new demointer();
		s1.displayone();
		s1.displaytwo();
		s1.displaysmg();
	}



}
