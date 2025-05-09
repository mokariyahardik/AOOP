public class Rectangle{
    
    private double height;
    private double weight;
    
    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
 
    public double getArea() {
   
        return height * weight;
    }

   
    public void displayDetails() {
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
       
        Rectangle rect = new Rectangle(5.0, 7.0);

        
        rect.displayDetails();
    }
}
