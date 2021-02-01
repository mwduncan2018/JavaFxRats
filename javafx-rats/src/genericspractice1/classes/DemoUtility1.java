package genericspractice1.classes;

import java.util.List;

import javafx.util.Pair;

public class DemoUtility1 {

	public static List<? super Integer> appendRandomNumToList(List<? super Integer> superIntList) {
		superIntList.add((int) (Math.random() * 10));
		return superIntList;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getValue() == p2.getValue();
	}

	public static <U extends Number> void printNumber(U number) {
		System.out.println(number.getClass() + " -> " + number.doubleValue() + " -> " + number.byteValue());
	}

	public static <O extends Object> void printObject(O object) {
		System.out.println(object.getClass());
	}

	public static <T extends Comparable<T>> Integer countGreaterThan(T[] array, T element) {
		Integer x = 0;
		for (T item : array) {
			if (item.compareTo(element) > 0) {
				x++;
			}
		}
		return x;
	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.print(o + "... ");
		}
		System.out.println("");
	}
}
