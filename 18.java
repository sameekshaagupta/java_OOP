import java.io.*; 
import java.util.*; 
public class 18
{ 
public static void main(String args[]) 
{ 
System.out.println(“Sameeksha 
Gupta”); 
System.out.println(“22BCP343”); 
try 
{ 
Scanner sc = new Scanner(new File("pqr.text")); 
FileWriter fw = new FileWriter("def.text"); 
PrintWriter pw = new PrintWriter(fw); 
Set <String> s = new HashSet<>(); 
while(sc.hasNextLine()) 
{ 
String input = sc.nextLine(); 
if(s.add(input)) 
{ 
pw.println(input); 
} 
} 
fw.flush(); 
} catch(IOException 
e) 
{ 
System.out.println("File error"); 
} 
} 
}