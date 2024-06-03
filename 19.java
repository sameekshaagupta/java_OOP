import java.util.*; 
import java.io.*; 
public class 19 
{ public static void main(String 
args[]) 
{ 
System.out.println("Sameeksha 
Gupta"); 
System.out.println("22BCP343"); 
try 
{ 
int a[]={1,2,4,5,3,6,7}; 
System.out.println("Enter the index of the number"); 
Scanner sc = new Scanner(System.in); int i = 
sc.nextInt(); System.out.println(a[i]); 
try 
{ 
System.out.println("Enter the value of Divisor"); 
int b = sc.nextInt(); int x = a[i]/b; 
System.out.println("The answer is: "+x); 
} 
catch(ArithmeticException e2) 
{ 
System.out.println("Division by zero in not possible"); 
} } catch(ArrayIndexOutOfBoundsException 
e1) 
{ 
System.out.println("Element at such index does not exist"); 
} 
} 
}