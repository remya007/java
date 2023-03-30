import java.util.Scanner;
class test
{
public static void main(String args[])
{
	CPU obj1 = new CPU();
	obj1.display1();

	CPU.RAM obj3 = new CPU.RAM();
	obj3.set();
	obj3.display();
}
}
class CPU
{	int price;
	Scanner n = new Scanner(System.in);
	void display1()
	{	
		Processor obj2 =new Processor();
		obj2.read();
		obj2.display2();
	}
	class Processor
	{	int ncores;
		String manft;
	
		void read()
		{
		System.out.println("Enter the price of CPU ");
		price = n.nextInt();
		System.out.println("Enter the no: of cores ");
		ncores = n.nextInt();
		System.out.println("Enter the name of CPU manufacturer ");
		manft = n.next();
		}
		void display2()	
		{
			System.out.println("Manufacturer: " +manft);
			System.out.println("Number of cores: " +ncores);
			System.out.println("Price: " +price);
		}
	}
	public static class RAM
	{
		Scanner n = new Scanner(System.in);
		String manf;
		int mm;
		void set()
		{
		System.out.println("Enter the memory size ");
		mm = n.nextInt();
		System.out.println("Enter the name of manufacturer ");
		manf = n.next();
		}
		void display()
		{	System.out.println("Memory Size " +mm+"GB");
			System.out.println("Memory manufacturer " +manf);
		}
	}
}
