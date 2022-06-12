package fac;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Exetest extends TestCase{


	
	/*
	@Test
	public void test() {
	Exe e=new Exe();
		int cal=4*3*2*1;
		org.junit.Assert.assertEquals(cal,e.fac(4));
	}
	*/
	@Test
	public void test2() {
	Exe e=new Exe();
		//int cal=4*3*2*1;
		org.junit.Assert.assertEquals(1,e.fac0(0));
	}
	
}
