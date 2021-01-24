package scenebuilderdemo4;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Task {
	StringProperty priority = new SimpleStringProperty();
	StringProperty description = new SimpleStringProperty();
	ObjectProperty<Integer> progress = new SimpleObjectProperty();

	public StringProperty priorityProperty() {
		return priority;
	}

	public StringProperty getPriority() {
		return priority;
	}

	public void setPriority(StringProperty priority) {
		this.priority = priority;
	}

	public StringProperty descriptionProperty() {
		return description;
	}

	public StringProperty getDescription() {
		return description;
	}

	public void setDescription(StringProperty description) {
		this.description = description;
	}

	public ObjectProperty<Integer> progressProperty() {
		return progress;
	}

	public ObjectProperty<Integer> getProgress() {
		return progress;
	}

	public void setProgress(ObjectProperty<Integer> progress) {
		this.progress = progress;
	}
}