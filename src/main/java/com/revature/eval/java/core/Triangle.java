package com.revature.eval.java.core;

public class Triangle {

	private double sideOne;
	private double sideTwo;
	private double sideThree;

	public Triangle() {
		super();
	}

	public Triangle(double sideOne, double sideTwo, double sideThree) {
		this();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	public boolean isEquilateral() {
		int count = 0;
		boolean choice = false;
		// TODO Write an implementation for this method declaration
		if (this.sideOne == this.sideTwo || this.sideOne == this.sideThree) {
			count += 1;
		}
		if (this.sideTwo == this.sideThree || this.sideTwo == this.sideOne) {
			count += 1;
		}
		if (this.sideThree == this.sideOne || this.sideThree == this.sideTwo) {
			count += 1;
			
		}

		switch (count) {
		case 1:
			choice = false;
			break;
		case 2:
			choice = false;
			break;
		case 3:
			choice = true;
			break;
		}
		return choice;
		
	}

	public boolean isIsosceles() {
		int count = 0;
		boolean choice = false;
		// TODO Write an implementation for this method declaration
		if (this.sideOne == this.sideTwo || this.sideOne == this.sideThree) {
			count += 1;
		}
		if (this.sideTwo == this.sideThree || this.sideTwo == this.sideOne) {
			count += 1;
		}
		if (this.sideThree == this.sideOne || this.sideThree == this.sideTwo) {
			count += 1;
			
		}

		
		switch (count) {
		case 1:
			choice = false;
			break;
		case 2:
			choice = true;
			break;
		case 3:
			choice = false;
			break;
		}
		return choice;
	}

	public boolean isScalene() {
		int count = 0;
		boolean choice = false;
		// TODO Write an implementation for this method declaration
		if (this.sideOne == this.sideTwo || this.sideOne == this.sideThree) {
			count += 1;
		}
		if (this.sideTwo == this.sideThree || this.sideTwo == this.sideOne) {
			count += 1;
		}
		if (this.sideThree == this.sideOne || this.sideThree == this.sideTwo) {
			count += 1;
		}

		
		switch (count) {
		case 0:
			choice = true;
			break;
		case 1:
			choice = false;
			break;
		case 2:
			choice = false;
			break;
		case 3:
			choice = false;
			break;
		}
		return choice;
	
	}
	

}
