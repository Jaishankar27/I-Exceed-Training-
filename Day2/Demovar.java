class sample
{
	static int a=10;
	int j=20;
	public void display(){
		System.out.println("x="+a);
		System.out.println("y="+j);
	}
	static void display1(){
		System.out.println("x="+a);
		System.out.println("y="+new sample().j);
	}
	public static void main(String ads[])
	{
		sample obj=new sample();
		obj.display();
		display1();
	}
}
/*class Demovar
{
	public static void main(String ads[])
	{
		sample obj=new sample();
		obj.display();
		sample.display1();
	}	
}*/
