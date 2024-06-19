public class Car {
    // instance variables
    private String make;
    private int manufacturing_year;
    private double price;
    private double travelled_distance;

    /**
     * Constructor for objects of class Car
     */
    public Car() { // Default constructor
        // initialise instance variables
        make = "";
        manufacturing_year = 0;
        price = 0.0;
        travelled_distance = 0.0;
    }
    
    /**
     * Constructor for objects of class Car
     */
    public Car(String m, int y, double p, double t) { // Normal constructor
        // initialise instance variables
        make = m;
        manufacturing_year = y;
        price = p;
        travelled_distance = t;
    }

    /**
     * Setter / Mutator
     */
    public void setMake(String m) {
        make = m;
    }
    
    /**
     * Setter / Mutator
     */
    public void setManufacturing_year(int y) {
        manufacturing_year = y;
    }
    
    /**
     * Setter / Mutator
     */
    public void setPrice(double p) {
        price = p;
    }
    
    /**
     * Setter / Mutator
     */
    public void setTravelled_distance(double t) {
        travelled_distance = t;
    }
    
    /**
     * Getter / Retriever / Accessor
     */
    public String getMake() {
        return make;
    }
    
    /**
     * Getter / Retriever / Accessor
     */
    public int getManufacturing_year() {
        return manufacturing_year;
    }
    
    /**
     * Getter / Retriever / Accessor
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Getter / Retriever / Accessor
     */
    public double getTravelled_distance() {
        return travelled_distance;
    } 
    
    /**
     * Processor
     */
    public String StatusOfCar(int y) {
        String status = "";
        if (y > 2017)
            status = "new car";
        else if (y >= 2015 && y <= 2017)
            status = "quite new";
        else if (y >= 2008 && y <= 2014)
            status = "medium age car";
        else if (y >= 1998 && y <= 2008)
            status = "old car";
        else if (y < 1998)
            status = "old car";
        return status; 
    }
    
    /**
     * Printer
     */
    public String toString() {
        return "Make = " + make + "\n" + 
               "Manufacturing year = " + manufacturing_year + "\n" + 
               "Price = " + price + "\n" + 
               "Travelled distance = " + travelled_distance;
    } 
}
