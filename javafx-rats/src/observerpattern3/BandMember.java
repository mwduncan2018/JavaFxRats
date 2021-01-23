package observerpattern3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BandMember implements PropertyChangeListener {
	private String name;
	private String song;
	private String instructions;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getInstructions() {return instructions;}
	public String getSong() {return song;}
	public void setSong(String song) {this.song = song;}
	public void setInstructions(String instructions) {this.instructions = instructions;}

	public BandMember(String name) {
		setName(name);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("instructions")) {
			setInstructions((String) evt.getNewValue());			
		}
		if (evt.getPropertyName().equals("song")) {
			setSong((String) evt.getNewValue());			
		}
	}

}
