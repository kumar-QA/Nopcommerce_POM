
public class Employee {
	
	
	String add(){
	     int a=10;
	     int b=20;
	    return "hi";
	    
	    }
	
	void add(String a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {

		Employee e=new Employee();
		e.add();
		e.add(e.add(),45);
	}
	
	

}
