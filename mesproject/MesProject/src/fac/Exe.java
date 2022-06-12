package fac;

public class Exe {
	
/*
	public int fac(int no) {
		int ges=no;
		
	for (int i = no-1; i >0; i--) {

		ges*=i;
		
		return ges;
	}	
	*/
	

	public long fac0(int no) {
		int ges=1;
		
		for (int i = no; i >0; i--) {

			ges*=i;
			
			
		}	
		return ges;
	
	}
	
	public long tablem(int no) {
		int ges=0;
		
		for (int i = 0; i >0; i++) {

			ges*=i;
			
			
		}	
		return ges;
	
	}

}
