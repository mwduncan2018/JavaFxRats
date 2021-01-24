package bindingpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

class BindingPractice2 {
	@Test
	void testPractical() {
		class Task {
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
		Task t = new Task();
	}

}
