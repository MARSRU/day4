package com.cslb.app.spel;

public class Car {

	String carName;
	double width;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", width=" + width + "]";
	}

}
