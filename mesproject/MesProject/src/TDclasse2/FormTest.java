package TDclasse2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormTest {
/*
	@Test
	public void test() {
		Form f=new Form("rectangle", 3, 5);
		  
		 f.setName("iso");
		org.junit.Assert.assertEquals(f.getName(), f.Identity("rectangle"));
	}

	*/
	@Test
	public void test2() {
		Form f=new Form("carre", 3, 5);
		  
		 f.setName("carre");
		 f.getX();
		 f.getY(); 
		 
		 f.setX(4); 
		 f.setY(6);
		 
		org.junit.Assert.assertEquals(f.getName(), f.Identity("carre"));
		
	}

}
