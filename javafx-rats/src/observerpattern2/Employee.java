package observerpattern2;

import java.util.Observable;
import java.util.Observer;

public class Employee implements Observer {
	private String name;
	private String message;

	public Employee(String name) {
		this.message = "";
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public void update(Observable o, Object message) {
		System.out.println(this.name + " updating message");
		this.message = (String) message;
	}

}
