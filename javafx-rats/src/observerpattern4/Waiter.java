package observerpattern4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Waiter implements PropertyChangeListener {
	private String name;
	private String generalMessage;
	private String payRaiseMessage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Waiter(String name) {
		this.name = name;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("generalMessage")) {
			setGeneralMessage((String) evt.getNewValue());
		}
		if (evt.getPropertyName().equals("payRaiseMessage")) {
			setPayRaiseMessage((String) evt.getNewValue());
		}

	}

	public String getGeneralMessage() {
		return generalMessage;
	}

	public void setGeneralMessage(String generalMessage) {
		this.generalMessage = generalMessage;
	}

	public String getPayRaiseMessage() {
		return payRaiseMessage;
	}

	public void setPayRaiseMessage(String payRaiseMessage) {
		this.payRaiseMessage = payRaiseMessage;
	}
	

}
