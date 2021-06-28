package entities;

import exceptions.ConverterException;

public class Converter {
	
	private String bin;
	private int number;
	
	public Converter(String bin, int number) {
		this.bin = bin;
		this.number = number;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void limitedString() {
		int max = 8;
		
		if (!(bin.length() < max)) {
			throw new ConverterException("The limit of caracters is 8.");
		}
	}
	
	public int converterString() {
		return Integer.parseInt(bin, 2);
	}
	
}
