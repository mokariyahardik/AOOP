class Shape {

  static final double PI = 3.14;

  void Area(double r) {
      double A = PI * r * r;
      System.out.println("Area of the circle is: " + A);
  }

  void Area(double l, double w) {
      double A = l * w;
      System.out.println("Area of the rectangle is: " + A);
  }
}

public class AAA {

  public static void main(String[] args) {
      Shape s1 = new Shape();

      s1.Area(4);
      s1.Area(2, 5);
  }
}
