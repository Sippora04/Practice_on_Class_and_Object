/*
Write a program to print the area of two rectangles having sides (4,5)
and (5,8) respectively by creating a class named "Rectangle" with a
method named "Area" which returns the area and length and breadth
passed as parameters to its constructor.
*/
class Rectangle
{
  int length;
  int breadth;
  Rectangle (int a, int b )
  {
      length=a;
      breadth=b;
  }
  public int Area()
  {
    int area=length*breadth; 
    return area;
  }
public static void main(String[] args)
    {
    Rectangle a = new Rectangle(4,5);
    Rectangle b = new Rectangle(5,8);
    System.out.println("Rectangle1=> Area : "+a.Area());
    System.out.println("Rectangle2=> Area : "+b.Area());
  }
}
