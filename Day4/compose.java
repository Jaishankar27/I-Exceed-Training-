class Car
{
	final engine eng;
	String Carname,model;
	
	Car(String carname, String model){
		eng=new engine("power");
		this.Carname=carname;
		this.model=model;
	}
	public void display(){
		System.out.println("Carname"+Carname);
		System.out.println("model"+model);
		eng.display();
	}
}
class engine
{
	String eng;
	engine(String eng){
		this.eng=eng;
	}
	public void display(){
		System.out.println("engine name"+eng);
	}
}

class compose
{
	public static void main(String ads[]){
		Car c1=new Car("scoprio","vlx");
		c1.display();
	}
}

