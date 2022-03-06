import static org.junit.Assert.*;

import org.junit.Test;

import model.MyBubbleSort;
import model.MyFilter;

public class UnitTesting {

	@Test
	public void test() {
		MyBubbleSort sort = new MyBubbleSort();
		String arr = "5,3,6,8,7,2,10,1,9";
		int expect[] = {1,2,3,5,6,7,8,9,10};
		int output[] = sort.sort(arr);

		assertArrayEquals(expect, output);

	}

}
