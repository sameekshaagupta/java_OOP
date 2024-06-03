public class 13 { 
 public sta c void main(String[] args) { 
                 System.out.print("Sameeksha Gupta 22BCP343"); 
  String str1 = "abcde"; 
  String str2 = "edcba"; 
   
  if(reverseCheck(str1, str2)) System.out.println("Strings are reverse of each 
other"); 
  else System.out.println("Strings are NOT reverse of each other"); 
  } 
  
 public sta c boolean reverseCheck(String str1, String str2) { 
  if(str1.length() != str2.length()) return false; 
  for(int i = 0; i < str1.length()-1; i++) { 
   if(str1.charAt(i) != str2.charAt(str1.length()-1-i)) return false; 
  } 
  return true; 
 } 
} 