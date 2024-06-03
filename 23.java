class Hi extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hi");
        Thread.sleep(1000);
      }
    } catch (InterruptedException ie) {
      System.out.println(ie);
    }
  }
}
class Hello extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hello");
        Thread.sleep(1000);
      }
    } catch (InterruptedException ie) {
      System.out.println(ie);
    }
  }
}
class Welcome extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Welcome!!!");
        Thread.sleep(1000);
      }
    } catch (InterruptedException ie) {
      System.out.println(ie);
    }
  }
}
public class 23 {
  public static void main(String args[]) {
System.out.println("Sameeksha 
Gupta"); 
System.out.println("22BCP343"); 
Welcome ob = new Welcome(); 
Hi ob1 = new Hi(); Hello 
ob2 = new Hello(); 
ob2.setPriority(9); 
ob1.setPriority(2); 
ob.start(); try 
{
      ob.join(); 
} catch(InterruptedException 
ie) {
      System.out.println(ie); 
} 
ob1.start(); 
try 
{
      Thread.sleep(500); } 
catch(InterruptedException ie) 
{
      System.out.println(ie); 
} 
ob2.start();
  }
}