import java.io.*;
import java.util.*;
public class
20 {
  public static void main(String args[]) {
System.out.println("Sameeksha 
Gupta"); 
System.out.println("22BCP343"); 
try 
{
      int arr[] = {1, 2, 3, 4, 5, 6, 7};
      int lb = 0;
      int ub = 6;
      int mid;
      System.out.println("Enter the element to be searched");
      Scanner sc = new Scanner(System.in);
      int item = sc.nextInt();
      while (lb <= ub) {
        mid = (lb + ub) / 2;
        if (arr[mid] == item) {
          System.out.println(mid);
          System.exit(1);
        } else if (arr[mid] < item)
          lb = mid + 1;
        else
          ub = mid - 1;
      }
      if (lb > ub)
        throw(new ArrayIndexOutOfBoundsException()); } 
catch(ArrayIndexOutOfBoundsException e) 
{
      System.out.println("Array Index Out of Bounds"); 
}
  }
}