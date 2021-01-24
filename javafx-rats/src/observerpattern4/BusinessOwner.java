package observerpattern4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class BusinessOwner {
	private String name;
	private String generalMessage;
	private String payRaiseMessage;
	private PropertyChangeSupport support;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getGeneralMessage() {return generalMessage;}
	public String getPayRaiseMessage() {return payRaiseMessage;}

	public void setGeneralMessage(String generalMessage) {
		support.firePropertyChange("generalMessage", this.generalMessage, generalMessage);
		this.generalMessage = generalMessage;
	}
	
	public void setPayRaiseMessage(String payRaiseMessage) {
		support.firePropertyChange("payRaiseMessage", this.payRaiseMessage, payRaiseMessage);
		this.payRaiseMessage = payRaiseMessage;
	}
	
	public BusinessOwner(String name) {
		support = new PropertyChangeSupport(this);
		this.name = name;
	}
	
	public void addPropertyChangeListener(List<PropertyChangeListener> pclList) {
		pclList.forEach(x -> addPropertyChangeListener(x));
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
	
}
