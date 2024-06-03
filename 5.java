import java.util.*:
public class 5{
public static void main(String m[]){
System.out.println("Sameeksha Gupta");
System.out.println("22BCP343");
Scanner in=new Scanner(System.in):
String s=new String():
System.out.println("Enter a line:");
s=in.nextLine():
char c:
int ct=0;
for(int i=0;i<s.length():i++)
{
c=s.charAt(i);
if(c>=65 && c<=90)
{
ct++:
}
}
}
System.out.println("total number of words start with capital letters are:"+ct);
}