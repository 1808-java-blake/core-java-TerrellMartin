package com.revature.eval.java.core;

public class TriangleLauncher {

	public static void main(String[] args) {
		Triangle t = new Triangle(2,8,2);
		System.out.println(t.isEquilateral());
		System.out.println(t.isIsosceles());
		System.out.println(t.isScalene());

	}

}
