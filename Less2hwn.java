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
