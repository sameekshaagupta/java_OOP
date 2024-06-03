class Seven implements Runnable {
  Syncro sy;
  Seven(Syncro sy) {
    this.sy = sy;
  }
  public synchronized void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        sy.put7(i);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
class Eight implements Runnable {
  Syncro sy;
  Eight(Syncro sy) {
    this.sy = sy;
  }
  public synchronized void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        sy.put8(i);
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
class Syncro {
  boolean c = false;
  synchronized void put7(int i) throws InterruptedException {
    if (c) {
      wait();
    }
    c = true;
    System.out.println(7 + " x " + i + " = " + (7 * i));
    notifyAll();
  }
  synchronized void put8(int i) throws InterruptedException {
    if (!c) {
      wait();
    }
    c = false;
    System.out.println(8 + " x " + i + " = " + (8 * i));
    notifyAll();
  }
}
public class 22 {
  public static void main(String args[]) {
System.out.println("Sameeksha 
Gupta"); 
System.out.println("22BCP343"); 
Syncro ob=new Syncro(); 
Thread t1 = new Thread(new Seven(ob)); 
Thread t2 = new Thread(new Eight(ob)); 
t1.start(); 
try 
{
      Thread.sleep(10); 
} catch(Exception 
e) {
      System.out.println("Exception"); 
} 
t2.start();
  }
}