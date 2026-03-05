//Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. The class contains:
//Two double data fields named width and height.
//A no-arg constructor that creates a rectangle with the default values 1 and 2 for the width and height, respectively.
//A constructor that creates a rectangle with the specified width and height.
//A method named getArea() that returns the area of this rectangle.
//A method named getPerimeter() that returns the perimeter.
//Implement the class. Write a main method that creates two 
//Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
public class Main{
    public static void main(String[] args){
       Rectangle r1 = new Rectangle(4,40);
       Rectangle r2 = new Rectangle(3.5,35.9);
       System.out.println("The  width -> "+ r1.width);
       System.out.println("The Height -> "+ r1.height);
       System.out.println("The area: "+r1.getArea());
       System.out.println("The perimeter: "+ r1.getPerimeter());
       System.out.println("The  width -> "+ r2.width);
       System.out.println("The Height -> "+ r2.height);
       System.out.println("The area: "+r2.getArea());
       System.out.println("The perimeter: "+ r2.getPerimeter());
    }
}

class Rectangle{
    double width;
    double height;

  Rectangle(){
     width = 1;
     height = 2;
  }

  public  Rectangle(double width, double height){
    this.height = height;
    this.width = width;
  }
  public double  getArea(){
    return width * height;
  }
  public double getPerimeter(){
    return 2*(width + height);

  }
}