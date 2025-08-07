import java.util.Scanner;
class Car
{
	String nameofCompany;
	boolean isAvailable;
	
	Car(String nameofCompany, boolean isAvailable)
	{
		this.nameofCompany=nameofCompany;
		this.isAvailable=isAvailable;	
	}
	void getCarDetails()
	{
		System.out.println("nameofCompany"+nameofCompany);
		System.out.println("isAvailable"+isAvailable);
	}

}

class Scorpio extends Car
{
	String carName,modelName,color;
	Scorpio(String carName,String modelName,String color)
	{
		super(carName,true);
		this.carName=carName;
		this.modelName=modelName;
		this.color=color;
	}
	public void display()
	{
		System.out.println("carname"+carName);
		System.out.println("modelname"+modelName);
		System.out.println("color"+color);		

	}
}
class demoinher1
{
	public static void main(String ads[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter carname: ");
		String carname=input.nextLine();
		System.out.print("Enter modelname: ");
		String modelname=input.nextLine();
		System.out.print("Enter color: ");
		String color=input.nextLine();
		Scorpio s1=new Scorpio(carname,modelname,color);
		s1.getCarDetails();
		s1.display();
	}
}