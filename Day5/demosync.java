class call
{
	synchronized public void callme(String msg)
	{
		System.out.print("[");
		System.out.print("msg");
		System.out.print("]");
	}
	public void display(){
		for(var i=0;i<10;i++)
			System.out.println(i);
	}
}
class caller extends Thread
{
	call obj;
	String str;
	Thread t=new Thread(this);

	caller(call obj,String str){
		this.str=str;
		this.obj=obj;
		t.start();
	}
	public void run(){
		obj.callme(str);
	}
}
class demonsync
{
	public static void main(String args[])
	{
		call obj=new call();
		caller c1=new caller(obj,"hello");
		caller c2=new caller(obj,"hi");
		caller c3=new caller(obj,"welcome");
	}
}
