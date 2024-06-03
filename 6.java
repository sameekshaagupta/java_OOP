import java.util.*;  
public class 6{ public static void Area(double a, double b, double c){ 
double s = (a+b+c)/2.0;  
double AoT = Math.sqrt(s*(s-a)*(s-b)*(s-c));  
System.out.println("The are of Triangle is : " + AoT + "(sq. units)");  
public static void Area(double a, double b){  
double AoR = a*b; System.out.println("The are of Rectangle is : " + AoR + "(sq. units)"); }  
public static void Area(double a){  
double AoS = a*a;  
System.out.println("The are of Square is : " + AoS + "(sq. units)");  
}  
public static void main(String[] args){  
System.out.print("You want area of which geometric figure ?\n1. Area of Triangle.\n2. Area of Rectangle.\n3. 
Area of Square.\nEnter here --> "); 
Scanner sc = new Scanner(System.in);  
int n = sc.nextInt();  
switch(n){  
case 1:  
double x, y, z;  
System.out.print("Enter first side of triangle : ");  
x = sc.nextDouble();  
System.out.print("Enter second side of triangle : ");  
y = sc.nextDouble(); 
System.out.print("Enter third side of triangle : ");  
z = sc.nextDouble();  
Area(x, y, z);  
break;  
case 2:  
System.out.print("Enter first side of rectangle : ");  
x = sc.nextDouble();  
System.out.print("Enter second side of rectangle : ");  
y = sc.nextDouble();  
Area(x, y);  
break;  
System.out.print("Enter sides of square : "); 
x = sc.nextDouble(); 
Page   
7 | 
Area(x);  
break;  
default: System.out.println("Enter a valid input");  
}  
System.out.print("\Sameeksha Gupta\n 22BCP343");  
} 
}