package spring.boot.ch05.ex02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class MyTest {
	@Test
	public void testEmpty() {
		Nums nums = new Nums(new ArrayList<Integer>());
		assertEquals(1, nums.getMax());
	}
	
	@Test
	public void testEmpty2() {
		Nums nums = new Nums(new ArrayList<Integer>());
		try {
			nums.getMax();
			fail("원소값이 없는 경우 처리를 실패했습니다.");
		} catch(Exception e) {
			assertTrue(true);
		}
	}
}
