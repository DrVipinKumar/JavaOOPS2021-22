package inheritancepack;
class Employee {
	String name;
	int empid;
	String dept;
Employee(){
		
		System.out.println("I am in Employee Default Constructor");
}
	public Employee(String name, int empid, String dept) {
		this.name = name;
		this.empid = empid;
		this.dept = dept;
	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + "]";
//	}
	
	public String display() {
		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + "]";
	}
}
class Salary extends Employee {
	int hra, da, basic;

	public Salary(String name, int empid, String dept,int hra, int da, int basic) {
		super(name,empid,dept);
		this.name="jdkjfkd";
		this.hra = hra;
		this.da = da;
		this.basic = basic;
	}
	
	public String display() {
		return "Salary [hra=" + hra + ", da=" + da + ", basic=" + basic + ", name=" + name + ", empid=" + empid
				+ ", dept=" + dept + "]";
	}
	
	public void checkSalary() {
		System.out.println("Salary Method");
	}
}
public class PlaymentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Employee e =new Employee("Xyz",1,"IT");
//       System.out.println(e.display());
		Employee s =new Salary("Abc",2,"MCA",2000,1000,40000); //Upcasting
       System.out.println(s.display());;
       //s.checkSalary();
      // Salary s1 =(Salary) new Employee();//downcasting
       
	}

}
