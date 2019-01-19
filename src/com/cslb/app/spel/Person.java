package com.cslb.app.spel;

public class Person {

	private String name;
	private int age ;
	private double height;
	private Dog dog;
	private Car car;
	private String personType ;
	private boolean isMarray;
	
	
	
	
//	com.cslb.app.spel.Person   全包名  全类名



	public String getPersonType() {
		return personType;
	}

	public boolean isMarray() {
		return isMarray;
	}

	public void setMarray(boolean isMarray) {
		this.isMarray = isMarray;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public Person() {
		super();
	}

	public Person(String name, int age, double height, Dog dog, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.dog = dog;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", dog=" + dog + ", car=" + car
				+ ", personType=" + personType + ", isMarray=" + isMarray + "]";
	}


	

}
