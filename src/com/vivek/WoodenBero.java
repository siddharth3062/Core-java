package com.vivek;

public class WoodenBero extends Bero {
	public WoodenBero(String beroColor) {
		super("Wooden", beroColor);
	}
	@Override
	public void calculatePrice() {
		if(beroColor.equalsIgnoreCase("Brown")) {
			Price = 5500.0;
			} else if (beroColor.equalsIgnoreCase("White")) {
				Price = 5500.0;
				} else {Price = 4800.0;}
			}
}
