package propertypractice;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.ReadOnlyBooleanProperty;

public class JavaFxPropertyPractice {

	public static void main(String[] args) {

		SimpleIntegerProperty intProp = new SimpleIntegerProperty();
		intProp.set(15);
		SimpleStringProperty strProp = new SimpleStringProperty();
		strProp.set("ABC");
		System.out.println(intProp.get() + " - " + strProp.get());

		ReadOnlyBooleanWrapper readOnlyBooleanWrapper = new ReadOnlyBooleanWrapper(true);
		ReadOnlyBooleanProperty readOnlyBooleanProperty = readOnlyBooleanWrapper.getReadOnlyProperty();
		System.out.println(readOnlyBooleanProperty.get());
		readOnlyBooleanWrapper.set(false);
		System.out.println(readOnlyBooleanProperty.get());

		intProp.addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("intProp is changed to " + newValue);
			}
		});

		intProp.addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
			System.out.println("intProp updated to " + newValue);
		});

		intProp.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable observable) {
				System.out.println("intProp changed");
			}
		});

		strProp.addListener((Observable observable) -> {
			
		});
		
		intProp.set(69);
		intProp.set(11);
		intProp.set(33);
		intProp.set(43);
		intProp.set(84);
	}

}
