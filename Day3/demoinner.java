class karnataka
{
	private String CM, District_name;
	private double Area;
	
	class Mysuru
	{
		String collector_name;
		int area_dist;

		Mysuru(String collector, int area){
			this.collector_name=collector;
			this.area_dist=area;
		}
		public void display(){
			System.out.println("Name of CM"+CM);
			System.out.println("Collector"+collector_name);
			System.out.println("area"+area_dist); 
		}
	}
}

class demoinner
{
	public static void main(String ads[])
	{
		//karnataka.Mysuru my=new karnataka().new Mysuru("x",54543543);
		karnataka ka=new karnataka();
		karnataka.Mysuru my=ka.new Mysuru("x",569320);
		my.display();		
	}
}
