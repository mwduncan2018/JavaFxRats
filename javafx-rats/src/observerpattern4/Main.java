package observerpattern4;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BusinessOwner tony = new BusinessOwner("Tony");
		Manager erik = new Manager("Erik");
		Cook eric = new Cook("Erik");
		Janitor mike = new Janitor("Mike");
		Waiter stephanie = new Waiter("Stephanie");

		List<PropertyChangeListener> employeeList = new ArrayList<>();
		employeeList.add(erik);
		employeeList.add(eric);
		employeeList.add(mike);
		employeeList.add(stephanie);

		tony.addPropertyChangeListener(employeeList);

		tony.setGeneralMessage("Hello team, I have a good message for you");
		tony.setPayRaiseMessage("Everyone is getting a 5% raise");

		System.out.println(tony.getName() + " - " + tony.getGeneralMessage() + " - " + tony.getPayRaiseMessage());
		System.out.println(erik.getName() + " - " + erik.getGeneralMessage() + " - " + erik.getPayRaiseMessage());
		System.out.println(eric.getName() + " - " + eric.getGeneralMessage() + " - " + eric.getPayRaiseMessage());
		System.out.println(mike.getName() + " - " + mike.getGeneralMessage() + " - " + mike.getPayRaiseMessage());
		System.out.println(stephanie.getName() + " - " + stephanie.getGeneralMessage() + " - " + stephanie.getPayRaiseMessage());
	}

}
