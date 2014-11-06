package sample;
import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {
	@Test
	public void testNum() {
		int Num = Main.num();
		assertEquals(20, Num);
	}

}
