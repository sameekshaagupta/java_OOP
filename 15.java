public class 15{ 
    public static void main(String[] args) { 
      System.out.println("Sameeksha Gupta 22BCP343"); 
            Car car = new Car(); 
            car.start(); 
            car.playMusic(); 
            car.stop(); 
 
    } 
} 
    // First interface 
    interface Vehicle { 
        void start(); 
        void stop(); 
    } 
 
    // Second interface 
    interface MusicPlayer { 
        void playMusic(); 
    } 
 
    // Class implemen ng both interfaces 
    class Car implements Vehicle, MusicPlayer { 
     
        public void start() { 
            System.out.println("Car started"); 
        } 
 
        public void stop() { 
            System.out.println("Car stopped"); 
        } 
 
         
        public void playMusic() { 
            System.out.println("Car playing music"); 
        } 
    }