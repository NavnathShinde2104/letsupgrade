public class Employee
	{
		String name;
		int age;
		String city;
		Employee(String name,int age,String city)
		{
			this.name=name;
			this.age=age;
			this.city=city;
		}

		public void display()
		{
			System.out.println("The Name is "+this.name);
		}

		public static void main(String[] args)
		{
			Employee E1=new Employee("Navnath",21,"Karjat");
			E1.display();

			Employee E2=new Employee("Snehal",21,"Karjat");
			E2.display();
		}
	}

	/*

navnath@Navnath:~/Documents/LetsUpgrade/JAVA$ javac Employee.java 
navnath@Navnath:~/Documents/LetsUpgrade/JAVA$ java Employee
The Name is Navnath
The Name is Snehal
navnath@Navnath:~/Documents/LetsUpgrade/JAVA$ 




	*/