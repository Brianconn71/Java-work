package oop1.casting;

public class CastingPgm {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		RightAngledTriangle r1 = new RightAngledTriangle();
		
		t1.draw();
		r1.draw();
		r1.area();
		
		t1 = r1;
		t1.draw();
//		t1.area();
		
		
		Triangle t2 = new RightAngledTriangle();
		t2.draw();
		
		upcasting();
		downcasting();
	}
	
	public static void upcasting() {
		Shape s = new Triangle();
		s.draw();
		
		s = new RightAngledTriangle();
		s.draw();
		
		progToTheInterface(new Triangle());
		progToTheInterface(new RightAngledTriangle());
	}
	
	public static void downcasting() {
		Triangle t = new Triangle();
		RightAngledTriangle r = new RightAngledTriangle();
		
		t = r;
		t.draw();
	}
	
	public static void progToTheInterface(Shape d) {
		d.draw();
	}

}
