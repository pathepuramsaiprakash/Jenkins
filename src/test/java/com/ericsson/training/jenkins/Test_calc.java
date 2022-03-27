package com.ericsson.training.jenkins;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_calc extends Calculator {

	@Test
	public void add_test() {
		assertEquals(15,this.add_num(10,5));
	}

}
