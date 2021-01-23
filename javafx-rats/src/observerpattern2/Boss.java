package observerpattern2;

import java.util.Observable;

public class Boss extends Observable {
	private String name;
	private String message;

	public Boss(String name) {
		this.message = "";
		this.name = name;
	}

	public void setMessage(String message) {
		if (this.message.equals(message) == false) {
			this.message = message;
			setChanged();
		}
		notifyObservers(message);
	}

	public String getMessage() {
		return this.message;
	}
}
