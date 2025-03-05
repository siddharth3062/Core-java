package com.vivek;

public class SteelBero extends Bero {
	public SteelBero (String beroColor) {
		super("Steel",beroColor);
	}
	@Override
	public void calculatePrice() {
		if (beroColour.equalsIgnoreCase("Gray")) {
            price = 7000.0;
        } else if (beroColour.equalsIgnoreCase("Black")) {
            price = 7500.0;
        } else {
            price = 6800.0;
        }
	}
}