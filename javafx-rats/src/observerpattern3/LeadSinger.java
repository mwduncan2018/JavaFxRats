package observerpattern3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LeadSinger {
	private String name;
	private String instructions;
	private String song;
	private PropertyChangeSupport support;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getInstructions() {return instructions;}
	
	public void setSong(String song) {
		support.firePropertyChange("song", this.song, song);
		this.song = song;
	}

	public void setInstructions(String instructions) {
		support.firePropertyChange("instructions", this.instructions, instructions);
		this.instructions = instructions;
	}

	public LeadSinger(String name) {
		setName(name);
		support = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
}
