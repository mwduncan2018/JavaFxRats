package bindingpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

class BindingPractice4 {

	@Test
	void test1() {
		SimpleIntegerProperty intA = new SimpleIntegerProperty(15);
		System.out.println(intA.get());
	}

	@Test
	@Disabled
	void ignoreMe() {
		SimpleIntegerProperty intA = new SimpleIntegerProperty();
		intA.set(15);
		System.out.println(intA.get());

		SimpleStringProperty strA = new SimpleStringProperty("Velocity");
		System.out.println(strA.get());
		strA.set("Terminal");
		System.out.println(strA.get());

		ReadOnlyBooleanWrapper boolAWrapper = new ReadOnlyBooleanWrapper(true);
		ReadOnlyBooleanProperty boolAProperty = boolAWrapper.getReadOnlyProperty();
		System.out.println(boolAProperty.get());

		ReadOnlyBooleanProperty bullB = new ReadOnlyBooleanWrapper(false).getReadOnlyProperty();
		System.out.println(bullB.get());
	}

}
