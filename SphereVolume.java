package project1test;

import java.util.Scanner;


public class SphereVolume {
	public static void main(String[] args) {
		
		System.out.println("the purpose of this program is to find the volume of a sphere");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Diameter of sphere:" );
		
		double diam, radius, volume;
		
		diam = keyboard.nextDouble();
		
		radius = diam/2.0;
		
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("the volume is " + volume + " units cubed");
		
		
		
	}

}
