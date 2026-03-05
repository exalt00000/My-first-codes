//An n-sided regular polygon’s sides all have the same length and all of its angles have the same degree (i.e., the polygon is both equilateral and equiangular).
//  Design a class named RegularPolygon that contains:
//A private int data field named n that defines the number of sides in the polygon.
//A private double data field named side that stores the length of the side.
//A private double data field named x that defines the x-coordinate of the center of the polygon with default value 0.
//A private double data field named y that defines the y-coordinate of the center of the polygon with default value 0.
//A no-arg constructor that creates a regular polygon with the default value 3, 1, 0, and 0 for n, side, x, and y, respectively.
//A constructor that creates a regular polygon with the specified n and side. x and y are defaulted to 0.
//A constructor that creates a regular polygon with the specified n, side, x, and y.
//The accessor and mutator methods for all data fields.
//The method getPerimeter() that returns the perimeter of the polygon.
//The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon is 
//Implement the class. Write a main method that creates three RegularPolygon objects,
//created using RegularPolygon(), using RegularPolygon(6, 4) and RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.
public class Main{
  public static void main(String[] args){
    RegularPolygon p1 = new RegularPolygon();
    RegularPolygon p2 = new RegularPolygon(6,4);
    RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
    System.out.println("The Area of the object1: " + p1.getArea());
    System.out.println("The Perimeter of the object1: " + p1.getPerimeter());
    System.out.println("The Area of the object2: " + p2.getArea());
    System.out.println("The Perimeter of the object2: " + p2.getPerimeter());
    System.out.println("The Area of the object3: " + p3.getArea());
    System.out.println("The Perimeter of the object3: " + p3.getPerimeter());

  }
}
class RegularPolygon{
  private int n;
  private double side;
  private double x;
  private double y;

  public RegularPolygon(){
    n = 3;
    side = 1;
    x = 0;
    y = 0;
    }
    public RegularPolygon(int n, double side){
      this.n = n;
      this.side = side;
      x = 0;
      y = 0;
    }

    public  RegularPolygon(int n, double side, double x, double y){
      this.n = n;
      this.side = side;
      this.x = x;
      this.y = y;
    }
    public void setN(int n){
      this.n = n;
    }
    public void setSide(double side){
      this.side = side;
    }
    public void setX(double x){
      this.x = x;
    }
    public void setY(double y){
      this.y = y;
    }
    public int getN(){
      return n;
    }
    public double getSide(){
      return side;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
    public double getPerimeter(){
      return n * side;
    }
    public double getArea(){
      return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
