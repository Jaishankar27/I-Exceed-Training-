class Address
 {
    int plotno,pin;
    String st,city;
 
      Address(String st,String city,int plotno,int pin)
        {
            this.plotno=plotno;
            this.pin=pin;
            this.st=st;
            this.city=city;
        }
     public void displayAddress()
     {
        System.out.println("Plot"+plotno);
        System.out.println("Street"+st);
        System.out.println("City"+city);
        System.out.println("Pincode"+pin);
     }
 } 
 
class Student
 {
    String name,dept;
    int roll;
    Address adr;
 
    Student(int roll,String name,String dept,Address adr)
    {
        this.roll=roll;
        this.name=name;
        this.dept=dept;
        this.adr=adr;
    }
 
    public void displayStudent()
        {
            System.out.println("Name of the student"+name);
            System.out.println("Roll"+roll);
            System.out.println("Department"+dept);
            adr.displayAddress();
        }
 
 }
 
 class demopractise
 {
      public static void main(String[] args) 
      {
          Address a1=new Address("Koramangala A blk","Bangalore",2,4324324);
          Student s1=new Student(1,"Rakesh","cse",a1);
          s1.displayStudent();
	  a1.displayAddress();
 
      }
  }
 