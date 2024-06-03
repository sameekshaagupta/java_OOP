import java.u l.Scanner; 
 
public class 14 { 
    public static void main(String[] args) { 
System.out.println("Sameeksha Gupta 22BCP343"); 
      Triangle ob=new Triangle(); 
      Circle ob1= new Circle(); 
      Rectangle ob2=new Rectangle(); 
      ob.area(); 
      ob1.area(); 
      ob2.area(); 
 
    } 
} 
abstract class Shapes { 
    abstract void area(); 
} 
 
class Triangle extends Shapes{ 
 
    void area() { 
        System.out.println("Enter 3 sides:"); 
        Scanner sc= new Scanner(System.in); 
        int s1= sc.nextInt(); 
        int s2=sc.nextInt(); 
        int s3=sc.nextInt(); 
        double semi = (s1+s2+s3)/2.0d; 
        double resArea = Math.sqrt(semi* (semi - s1) * (semi - s2) * (semi - s3)); 
        System.out.println("Area of Triangle = " + resArea); 
    } 
} 
 
class Rectangle extends Shapes{ 
    void area() { 
        System.out.println("Enter 2 sides:"); 
        Scanner sc= new Scanner(System.in); 
        int s1= sc.nextInt(); 
        int s2=sc.nextInt(); 
        float area_r = s1*s2; 
        System.out.println("Area of Rectangle is= "+area_r); 
    } 
} 
 
class Circle extends Shapes{ 
 
    void area() { 
        Scanner input = new Scanner(System.in); 
 
        System.out.print("Enter the radius of the circle: "); 
        double radius = input.nextDouble(); 
 
        // Calculate the area of the circle 
        double area_c = Math.PI * Math.pow(radius, 2); 
 
        System.out.println("The area of the circle is: " + area_c); 
    } 
}