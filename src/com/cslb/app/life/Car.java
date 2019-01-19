package com.cslb.app.life;

public class Car {

	String CarName;

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	@Override
	public String toString() {
		return "Car [CarName=" + CarName + "]";
	}

}
