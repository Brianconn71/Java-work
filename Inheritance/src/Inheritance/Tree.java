package Inheritance;

public class Tree {
	private String type;
	
	public Tree() {
		type="Beach";
	}
	
	public Tree(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public String getType(String prefix) {
		return prefix + " " + type;
	}

}
