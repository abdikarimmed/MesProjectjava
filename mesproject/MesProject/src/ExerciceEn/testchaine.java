package ExerciceEn;

import static org.junit.Assert.*;

import org.junit.Test;

public class testchaine {

	@Test
	public void test() {
	String a="bonjour";
	
	String maj=a.toUpperCase();
	org.junit.Assert.assertEquals("BONJOUR", maj);
	}

}
