package TDclasse2;

public class Form {
	
	private String name;
	private float x;
	private float y;

	
	
	
	public Form(String name2, int x2, int y2) {
		this.name = name;
		this.x = x;
		this.y = y; 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public String Identity(String name) {
		
		this.name=name;
		return this.name;
	}

}
