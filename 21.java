import java.util.Scanner;
class Addition extends Thread {
  public void run() {
    Scanner in = new Scanner(System.in);
    int x, y;
    x = in.nextInt();
    y = in.nextInt();
    System.out.println(x + y);
  }
}
class Subtraction extends Thread {
  public void run() {
    Scanner in = new Scanner(System.in);
    int x, y;
    x = in.nextInt();
    y = in.nextInt();
    System.out.println(x - y);
    in.close();
  }
}
public class
21 {
  public static void main(String args[]) {
System.out.println("Sameeksha 
Gupta"); 
System.out.println("22BCP343"); 
Addition ob1 = new Addition(); 
Subtraction ob2 = new 
Subtraction(); 
ob1.setName("Addition"); 
ob2.setName("Subtraction"); 
ob1.setPriority(2); 
ob2.setPriority(1); 
System.out.println(ob1.getName()+" Pritority: "+ob1.getPriority()); 
ob1.start(); while(ob1.isAlive()) try 
{
      ob1.join(); } 
catch(InterruptedException ie) 
{
      System.out.println(ie); 
} 
System.out.println(ob2.getName()+" Priority: "+ob2.getPriority()); 
ob2.start();
  }
}