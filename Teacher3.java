import java.util.Scanner;
class Person{
String Name;
String Gender;
String Address;
int Age;
Person(String name,String gender,String address,int age){
this.Name=name;
this.Gender=gender;
this.Address=address;
this.Age=age;
}
}
class Employee extends Person{
int Emp_id;
String Companyname;
String Qualification;
int Salary;
Employee(String name,String gender,String address, int age,int emp_id,String companyname,String qualification,int salary)
{
super(name,gender,address,age);
this.Emp_id=emp_id;
this.Companyname=companyname;
this.Qualification=qualification;
this.Salary=salary;
}
}
public class Teacher3 extends Employee{
String Subject;
String Department;
int Teacher_id;
Teacher3(String name,String gender,String address,int age,int emp_id,String companyname,String qualification,int salary,String subject,String department,int teacherid)
{
super(name,gender,address,age,emp_id,companyname,qualification,salary);
this.Subject=subject;
this.Department=department;
this.Teacher_id=teacherid;
}
void display(){
System.out.println("Name: "+Name);
System.out.println("Gender: "+Gender);
System.out.println("Address: "+Address);
System.out.println("Age: "+Age);
System.out.println("Employee id: "+Emp_id);
System.out.println("Company Name: "+Companyname);
System.out.println("Qualification: "+Qualification);
System.out.println("Salary: "+Salary);
System.out.println("Subject: "+Subject);
System.out.println("Department: "+Department);
System.out.println("Teacher id: "+Teacher_id);
}
public static void main(String[] args)
{
System.out.println("enter the number of teachers");
Scanner sc1=new Scanner(System.in);
int num=sc1.nextInt();
Teacher3 arr[]=new Teacher3[num];
System.out.println("enter the details of teachers");
int i=0 ,j=0;
Scanner sc=new Scanner(System.in);
for(i=0;i<num;i++)
{
System.out.println("\n Name: ");
String Name =sc.next();
System.out.println("\n Gender: ");
String Gender =sc.next();
System.out.println("\n Address: ");
String Address =sc.next();
System.out.println("\n Age: ");
int Age =sc.nextInt();
System.out.println("\n Employee id: ");
int Emp_id =sc.nextInt();
System.out.println("\n Company name: ");
String Companyname =sc.next();
System.out.println("\n Qualification: ");
String Qualification =sc.next();
System.out.println("\n Salary: ");
int Salary =sc.nextInt();
System.out.println("\n Subject: ");
String Subject =sc.next();
System.out.println("\n Department: ");
String Department =sc.next();
System.out.println("\n Teacher Id: ");
int Teacher_id =sc.nextInt();
arr[i]=new Teacher3(Name,Gender,Address,Age,Emp_id,Companyname,Qualification,Salary,Subject,Department,Teacher_id);
}
System.out.println("\nInformations of all the Teachers");
for(i=0;i<num;i++){
j=i+1;
System.out.println("\n"+j+").");
arr[i].display();
}
}
}      

