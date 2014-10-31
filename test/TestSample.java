import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;


public class TestSample {

	public static void main(String[] args) {
        JUnitCore.main(TestSample.class.getName());
    }

	@Test
	public void testsample(){
		assertEquals(10, Sample.num());
	}
}