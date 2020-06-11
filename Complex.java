/*
Print the sum, difference and product of two complex numbers by
creating a class named "Complex" with separate methods for each
operation whose real and imaginary parts are entered by user.
*/

import java.util.*;
class Complex
{
    int real;
    int imag;
    public Complex(int r, int i)
    {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b)
    {
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }

    public static Complex product(Complex a, Complex b)
    {
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex()
    {
		System.out.println("Complex Number: "+real+"+"+imag+"i");
    }

 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Real and Complex Number for Complex 1: ");
    int p=sc.nextInt();
    int q=sc.nextInt();
    System.out.println("Enter a Real and Complex Number for Complex 2: ");
    int r=sc.nextInt();
    int s=sc.nextInt();
    Complex a = new Complex(p,q);
    Complex b = new Complex(r,s);
    Complex x = Complex.add(a,b);
    Complex y = Complex.diff(a,b);
    Complex z = Complex.product(a,b);
    x.printComplex();
    y.printComplex();
    z.printComplex();
 }
}
