/*
Write a program to print the area and perimeter of a triangle having
sides of 3, 4 and 5 units by creating a class named "Triangle" without
any parameter in its constructor.
*/

class Triangle
{	 int s1,s2,s3;
	 //empty parameter constructor
	 Triangle()
	 {
	 	s1=3;
		s2=4;
		s3=5;
    }
	 public double getArea()
    {
      double s = (s1+s2+s3)/2;
      return Math.pow((s*(s-s1)*(s-s2)*(s-s3)),0.5);
    }
    public double getPerimeter()
    {
      return (s1+s2+s3)/2;
    }

    public static void main( String[] args )
    {
        Triangle t = new Triangle();
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
    }
}
