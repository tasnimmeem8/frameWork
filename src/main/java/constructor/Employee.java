package constructor;
public class Employee {
	
	String Name, Gender, Race;
	int Id, Age;
	
	Employee(){
		System.out.println("No data");
	}
	
	Employee(String n, String g , String r , int i , int a){
		 Name = n;
		 Gender = g;
		 Race = r;
		 Id = i;
		 Age = a;
	}
	
	Employee(String n, String g, String r, int i ){
		 Name = n;
		 Gender = g;
		 Race = r;
		 Id = i;	
	}
	void displayinfo() {
		System.out.println("Name- "+Name);
		System.out.println("Gender- "+Gender);
		System.out.println("Race- "+Race);
		System.out.println("Employee Id- "+Id);
		System.out.println("Age- "+Age);
		System.out.println("  ");
	}
	public static void main(String[]args) {
		
		Employee emp1= new Employee();
		emp1.displayinfo();
		
		Employee em2 = new Employee("Meem","F","Asian",48212,33);
		em2.displayinfo();
		
		Employee em3 = new Employee ("Ohona","F","Asian",11757,28);
		em3.displayinfo();
	}
}
