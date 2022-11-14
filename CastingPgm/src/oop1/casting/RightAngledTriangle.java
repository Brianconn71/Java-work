package oop1.casting;

public class RightAngledTriangle extends Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Right angle");
	}
	
	public void area() {
		System.out.println("area");
	}

}
