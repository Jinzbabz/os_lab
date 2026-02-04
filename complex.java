import java.util.Scanner;
class Main{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter real and imaginary part of first complex number:");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
System.out.print("Enter real and imaginary part of second complex number:");
    double c=sc.nextDouble();
    double d=sc.nextDouble();
    System.out.print("sum=" +(a+c)+"+"+(b+d)+"i");
}
}