package postgrad.oop1.codesample;

abstract class Oriental implements Restaurant {
	protected String name;
	
	public Oriental(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}

class Japanese extends Oriental {
	Japanese(String name){
		super(name);
	}
	@Override
	public void open() {
		System.out.println("Japanese::open()");
	}
	@Override
	public void close() {
		System.out.println("Japanese::close()");
	}
}

class Chinese extends Oriental implements Tagged{
	Chinese(String name){
		super(name);
	}
	
	@Override
	public void open() {
		System.out.println("Chinese::open()");
	}
	@Override
	public void close() {
		System.out.println("CHinese::close()");
	}
}
