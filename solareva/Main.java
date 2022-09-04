package com.solareva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner in = new Scanner(System.in);
		        System.out.print("Введіть перший катет: ");
		        double p = in.nextDouble();
		        System.out.print("Введіть другий катет: ");
		        double b = in.nextDouble();
		        
		        double h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));
		        
		        System.out.println("Гіпотенуза = " + h);
		    }
	}

