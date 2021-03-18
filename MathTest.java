import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MathTest {
	Math math;
	
	@BeforeEach
	void init() {
		System.out.println();
		math= new Math();
	}	
	@Test
	void testAdd() {
		int result= math.add(1,2);
		Assert.assertEquals(3,result);
	}	
	@Test
	void testMultiply() {
		int result1 = math.multiply(1,2);
		Assert.assertEquals(2,result1);
	}
}
