import static org.junit.Assert.*;

import org.junit.Test;

import model.MyBubbleSort;

public class UnitTesting {

	@Test
	public void test() {
		
		String txt = "Apple";

		char excpect[] = { 'a', 'e', 'l', 'p', 'p' };

		MyBubbleSort sort = new MyBubbleSort();
		char output[] = sort.sort(txt);

		assertArrayEquals(excpect, output);
		
	}

}
