package spring.boot.ch05.ex03;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TestTwo {
	@Test
	public void test() {
		assertNotNull(new Date());
	}
}
