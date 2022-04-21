import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.riya.calc.sum;

public class suntest {
	@Test
	public void addtest() {
		sum addtest = new sum();
		int actualval = addtest.addition();
		
		assertEquals(5,actualval);
		assertEquals(5,actualval);
		
	}

}
