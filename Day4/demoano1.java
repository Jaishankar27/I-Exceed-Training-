interface student
{
	public void displayStudent(String name,int age,String city);

}

class demoano1
{
	public static void main(String ads[])
	{
		student d=new student(){
			@Override
			public void displayStudent(String name,int age,String city){
				System.out.println("Name"+name);
				System.out.println("age"+age);
				System.out.println("city"+city);
			}
	
		};
		d.displayStudent("J",21,"Blore");
	}
}

/*abstract class student

{

   abstract public void displayStudent(String name,int age,String city);

}
 
 
class demoano1

{

    public static void main(String asd[])

	{

	  student d= new student(){

		public void displayStudent(String name,int age,String city)

			{

				System.out.println("Name"+name);

	 			System.out.println("Age"+age);

	  			System.out.println("City"+city);

			}	

		};
		d.displayStudent("X",4,"blore");

	}

}*/
 
