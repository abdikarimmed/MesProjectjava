package ExerciceEn;

public class EXO1 {

	
/*
	public int somme(int a, int b) {
		int cal=a+b;
		
		return cal;
	}

	public int div(int a, int b) {
		int cal=0/b;
		
		return cal;
	}
	*/

	
	public int prod(int a, int b) {
	boolean zero=false;
		
		if(a==0) {
			zero= true;
			
		}
		if(b==0) {
			zero= true;
		}
		if(zero) {
			return 0;
			
		}else {
			
			return a*b;
		}
	}
	
	

}
