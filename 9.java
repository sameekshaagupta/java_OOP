public class 9 { 
    public sta c void main(String[] args) { 
      System.out.println("Sameeksha Gupta 22BCP343"); 
      Distance ob1= new Distance(); 
      ob1.converter(48); 
    } 
 
 
} 
 class Distance{ 
     public Distance() {} 
     public void converter(int value){ 
         int feet=0; 
         int inch =0; 
 
         feet=value/12; 
         value=value%12; 
         if(value<12){ 
             inch=value; 
         } 
         System.out.println("Feet: "+feet); 
         System.out.println("Inch: "+inch); 
     } 
 }