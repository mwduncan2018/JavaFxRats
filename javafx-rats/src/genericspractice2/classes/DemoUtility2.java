package genericspractice2.classes;

import java.util.List;

public class DemoUtility2 {

	public static void printNumberList(List<? extends Number> srcList) {
		for (Number number : srcList) {
			System.out.println(number);
		}
	}
	
	public static void addDoubleToList(List<? super Double> destList) {
		destList.add(Math.random() * 10);
	}
	
	
}
