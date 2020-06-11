/*
Write a program to print the area of a rectangle by creating a class
named "Area" taking the values of its length and breadth as parameters
of its constructor and having a method named "returnArea" which returns
the area of the rectangle. Length and breadth of rectangle are entered
through keyboard.
*/

import java.util.*;
class Area
{
	int length;
	int breadth;
	public Area(int l, int b)
	{
		length = l;
		breadth = b;
	}
	public int returnArea()
	{
		return length*breadth;
	}
	public static void main(String[] args)
	{
		int l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		l = sc.nextInt();
		System.out.println("Enter breadth");
		b = sc.nextInt();
		Area a = new Area(l,b);
		System.out.println("Area of a reactangle : "+a.returnArea());
	}
}
