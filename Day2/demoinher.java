class sample
{
    String name,dept;
    int age; 
    sample(String name,int age,String dept)
	{
	  this.name=name;
	  this.age=age;	 
	  this.dept=dept;
	  this.displayStudent();
	}
    public void displayStudent()
	{
	   System.out.println("Name="+name);
	   System.out.println("Age="+age);
	   System.out.println("Department="+dept);
	}
   }
 
class teacher extends sample 
{
    teacher(String name,int age,String dept)
	{
	   super(name,age,dept);
	   System.out.println("Name of the Teacher"+name);
	}
}
class student extends sample
{
	student(String name,int age,String dept)
	{
	super(name,age,dept);
	}
}

class demoinher
{
    public static void main(String asd[])
	{
	    student obj=new student("sivam",32,"CSE");
	}
}