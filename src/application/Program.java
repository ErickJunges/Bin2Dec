package application;

import java.util.Scanner;

import entities.Converter;
import exceptions.ConverterException;

public class Program {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digits binary: ");
		String bin = sc.nextLine();
		
		int numero = 0;
		
		Converter c = new Converter(bin, numero);
		c.limitedString();
		numero = c.converterString();
		
		System.out.println();
		System.out.println("Binary in decimal equivalent: " + numero);
		
		
		sc.close();
		}
		catch (ConverterException msg) {
			System.out.println(msg.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("Only this caracters: '0' and '1'. ");
		}
	}

}
