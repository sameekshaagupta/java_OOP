// Pkg 2 child 
package package2; 
import package1.Parent; 
 
public class Child extends Parent { 
    public void display() { 
        System.out.println("Inside Child class in a different package (package2)"); 
    } 
} 