import java.io.*; 
public class 17 
{ public static void main(String 
args[]) 
{ 
System.out.println("Sameeksha 
Gupta"); 
System.out.println("22BCP343"); 
FileReader fr = null; 
BufferedReader br = null; 
FileWriter fw = null; 
PrintWriter pw = null; 
try 
{ fr = new FileReader("In.text"); 
br = new BufferedReader(fr); fw 
= new FileWriter("Out.text"); 
pw = new PrintWriter(fw); 
String s = br.readLine(); 
while(s!=null) 
{ 
String s1 = s.toUpperCase(); 
pw.println(s1); s = 
br.readLine(); 
} 
fr.close(); 
br.close(); 
fw.close(); 
pw.close(); } 
catch(IOException e) 
{ 
System.out.println("File Error" +e); 
} 
} 
}