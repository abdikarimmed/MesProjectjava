package TDClasse;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiTest {
 
	@Test 	              //x*y
	public void test() {
	 
		Multi m=new Multi();
		
		org.junit.Assert.assertEquals(16,m.multi(4, 4));
	
		
	}
	
	@Test 	                //si x==0
	public void test2() {
		
		
		Multi m=new Multi();
		
		org.junit.Assert.assertEquals(0,m.multi(0, 4));
	
}

	
	                      //si x<0
	@Test
	public void test3()  {
		
		
		Multi m=new Multi();
		
		org.junit.Assert.assertEquals(2,m.multi(-1, 2));
	
}

	                       //si y<0
	@Test
	public void test4() {
		
		
		Multi m=new Multi();
		
		org.junit.Assert.assertEquals(2,m.multi(2, -1));
	
}


}
