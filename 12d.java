class Rectangle { 
    int length; 
    int width; 
 
    public Rectangle(int length, int width) { 
        this.length = length; 
        this.width = width; 
    } 
 
    public int calculateArea() { 
        return length * width; 
    } 
} 
 
public class 12d { 
    public sta c void main(String[] args) { 
        System.out.println("Sameeksha Gupta 22BCP343"); 
        Rectangle rect = createRectangle(5, 3); 
        int area = rect.calculateArea(); 
        System.out.println("Area of Rectangle: " + area); 
    } 
 
    public sta c Rectangle createRectangle(int length, int width) { 
        return new Rectangle(length, width); 
    } 
} 