package observerpattern2;

public class Main {

	public static void main(String[] args) {
		Boss mike = new Boss("Mike");
		Employee yusuf = new Employee("Yusuf");
		Employee sonya = new Employee("Sonya");
		Employee james = new Employee("James");
		
		mike.addObserver(yusuf);
		mike.addObserver(sonya);
		mike.addObserver(james);
		mike.setMessage("Study automation");
		System.out.println(yusuf.getName() + " - " + yusuf.getMessage());
		System.out.println(james.getName() + " - " + james.getMessage());
		System.out.println(sonya.getName() + " - " + sonya.getMessage());
	}

}
