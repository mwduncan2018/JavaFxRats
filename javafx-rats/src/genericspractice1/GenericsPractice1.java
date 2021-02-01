package genericspractice1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import genericspractice1.classes.Box;
import genericspractice1.classes.DemoUtility1;
import genericspractice1.classes.Wildcard1;
import javafx.util.Pair;

class GenericsPractice1 {

	@Test
	void wildcardSubtyping() {
		List<?> qList;
		List<Object> oList;
		List<Integer> iList;
		//oList = new ArrayList<Integer>(); COMPILE ERROR!
		qList = new ArrayList<Integer>();		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	void wildcardLowerBounded1() {
		List<Object> o = new ArrayList<>();
		o = (List<Object>) DemoUtility1.appendRandomNumToList(o);
		o = (List<Object>) DemoUtility1.appendRandomNumToList(o);
		o = (List<Object>) DemoUtility1.appendRandomNumToList(o);
		o = (List<Object>) DemoUtility1.appendRandomNumToList(o);
		System.out.println(o);
	}
	
	@Test
	void wildcardUnbounded() {
		List<Double> d = Arrays.asList(new Double[] { 2d, 1d, 2.23d, 29.238d });
		DemoUtility1.printList(d);
	}
	
	@Test
	void wildcardDemo1() {
		Wildcard1 x = new Wildcard1(Arrays.asList(new Double[] { 2d, 1d, 2.23d, 29.238d }));
		x.printNumList();
	}

	@Test
	void boundedComparable() {
		Integer[] intArray = { 3, 5, 2, 8, 9, 1, 0, 10 };
		System.out.println(DemoUtility1.countGreaterThan(intArray, new Integer(5)));
	}

	@Test
	void boundedDemo1() {
		DemoUtility1.printNumber(new Byte((byte) 2));
		DemoUtility1.printNumber(new Double(10.5d));
		DemoUtility1.printNumber(new Integer(121));
		DemoUtility1.printObject(new String("test"));
	}

	@Test
	void demoUtility1() {
		Pair<String, Integer> p1 = new Pair<>("Test1", 1);
		Pair<String, Integer> p2 = new Pair<>("Test2", 1);
		System.out.println(DemoUtility1.compare(p1, p2));
	}

	@Test
	void boxDemo1() {
		Box<String, Integer> alphaBox = new Box<>("Five", 5);
		System.out.println(alphaBox.getValue());
		Box<String, String> betaBox = new Box<>("Six", "6");
		System.out.println(betaBox.getValue());
	}

	@Test
	void genericsInfo() {
		System.out.println("\nGenerics, E-Element, K-Key, N-Numnber, T-Type, V-Value\n");

	}

}
