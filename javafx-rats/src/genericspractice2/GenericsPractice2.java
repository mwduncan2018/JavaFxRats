package genericspractice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import genericspractice2.classes.DemoUtility2;

class GenericsPractice2 {

	@Test
	void wildcardOut() {
		List<Number> doubleList = new ArrayList<>();
		DemoUtility2.addDoubleToList(doubleList);
		DemoUtility2.addDoubleToList(doubleList);
		DemoUtility2.addDoubleToList(doubleList);
		DemoUtility2.printNumberList(doubleList);
	}
	
	@Test
	void wildcardIn() {
		DemoUtility2.printNumberList(Arrays.asList(new Integer[] {1, 2, 3} ));
	}

}
