import java.util.Scanner;
public class 2{
public static void main(String[] args) {
System.out.println("Sameeksha Gupta"); System.out.println("22BCP343");
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: "); double num1 = scanner.nextDouble();
System.out.print("Enter the second number: "); double num2 = scanner.nextDouble();
System.out.println("Select an operation:");
System.out.println("1. Addition"); System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
int operation = scanner.nextInt();
double result = 0;
switch (operation) {
case 1:
result = num1 + num2;
break;
case 2:
result = num1 num2;
break;
case 3:
result = num1* num2;
break;
case 4:
if (num2!=0) {
result = num1/num2;
} else {
System.out.println("Cannot divide by zero.");
return;
}
break;
default:
System.out.println("Invalid operation selection.");
return;
}
System.out.println("Result: " + result);
scanner.close();
}
}