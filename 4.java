import java.util.Scanner;
public class 4{
public static void main(String[] args) {
System.out.println("Sameeksha Gupta");
System.out.println("22BCP343");
Scanner scanner = new Scanner(System.in):
System.out.println("Enter a line: ");
String line = scanner.nextLine().toLowerCase():
// Convert the input to lowercase for easier comparison
int vowelCount = 0:
int consonantCount = 0;
for (int i = 0; i < line.length(): i++) {
char ch = line.charAt(i):
if (Character.isLetter(ch)) {
// Check if the character is a letter
if (ch == 'a' || ch=='e' || ch=='i' || ch== 'o' || ch== 'u') {
vowelCount++;
} else {
consonant Count++;
}
}
}
System.out.println("Number of vowels: " + vowelCount): System.out.println("Number of consonants: " + consonantCount):
}
}