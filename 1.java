import java.io.*;
import java.util.*;
public class 1{
public static void main(String args[]){
    System.out.println("Sameeksha Gupta"); System.out.println("22BCP343");
    int n, i, j, count;
    int m = 2;
    System.out.println("Enter the number upto which you have to find prime number:"); Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=1; i<= n; i++){
        while(true){
            for(count=0, j = 1; j <= m; j++){
                if(m % j = 0)       
                    count++;
                }
                if(count = 2){
                    System.out.println(m);
                    m++;
                    break;
                }
                else
            m++;
            }
        }
    }
}