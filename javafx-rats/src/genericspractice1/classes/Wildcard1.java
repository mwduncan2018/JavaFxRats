package genericspractice1.classes;

import java.util.List;

public class Wildcard1 {
	private List<? extends Number> numList;

	public Wildcard1(List<? extends Number> numList) {
		this.numList = numList;
	}
	
	public void printNumList() {
		numList.forEach(x -> System.out.println("Wishful Thinking -- " + x.doubleValue()));
	}
	
}
