# Less2hw
package com.gmail.kh;
import java.util.Scanner;
public class Less2hw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpit first side(a)");
		double a = sc.nextDouble();
		System.out.println("Inpit second side(b)");
		double b = sc.nextDouble();
		System.out.println("Inpit third side(c)");
		double c = sc.nextDouble();
		double p = (a + b + c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	    System.out.println("Square of triangle = " + s);

	}

}




package com.gmail.kh;

import java.util.Scanner;

public class Less2hwc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpit radius (r)");
		double r = sc.nextDouble();
		double l = 2 * r * Math.PI;
		System.out.println("Length of circule = " + l);
	}
	

}





package com.gmail.kh;
import java.util.Scanner;
public class Less2hwn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that include 5 numbers");
		int a = sc.nextInt();
		int a1=a/10000;
		System.out.println(a1);
		int a2=a%10000/1000;
		System.out.println(a2);
		int a3=a%1000/100;
		System.out.println(a3);
		int a4=a%100/10;
		System.out.println(a4);
		int a5=a%10/1;
		System.out.println(a5);
	
	}

}


