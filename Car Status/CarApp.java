import java.util.*;
public class CarApp
{
  public static void main (String args [] )
   {
      Scanner sc = new Scanner (System.in);
            
        System.out.println("Please enter the maker of the car: " );
        String make = sc.nextLine();
            
        System.out.println("Please enter the manufacturing year of the car: " );
        int manufacturing_year = sc.nextInt();
            
        System.out.println ("Please enter the price of the car: " );
        double price = sc.nextDouble();
            
        System.out.println ("Please enter the travelled distance of the car (km/h): " );
        double travelled_distance = sc.nextDouble();
            
        Car car1 = new Car (make,manufacturing_year,price,travelled_distance);//invoke a normal contructor
        System.out.println (car1.toString());
            
        System.out.println ("Please enter the average speed of the car (km/h) : ");
        double average_speed = sc.nextDouble();
        double total_hour = average_speed / travelled_distance ;    
            
        String status = car1.StatusOfCar(manufacturing_year) ;
            
        System.out.println("Average of total hours (time): "+total_hour);
        System.out.println("Status of the car is: "+status);
   }
}