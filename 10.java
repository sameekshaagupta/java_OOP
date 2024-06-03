public class 10{ 
    public sta c void main(String[] args) { 
        System.out.println("Sameeksha Gupta 22BCP343"); 
 
        Derived ob1 = new Derived(1, "Sameeksha Gupta"); 
        ob1.display(); 
    } 
} 
class Base{ 
    int emp_id; 
    String name; 
    public Base(int emp_id,String name ) { 
        this.emp_id=emp_id; 
        this.name=name; 
    } 
} 
 
class Derived extends Base{ 
    public Derived(int emp_id, String name) { 
        super(emp_id, name); 
    } 
    public void display(){ 
        System.out.println("EmployeeId: "+this.emp_id + " Name: "+ this.name); 
    } 
}