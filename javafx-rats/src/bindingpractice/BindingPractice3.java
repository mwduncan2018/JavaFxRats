package bindingpractice;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class BindingPractice3 {
	public static void main(String[] args) {
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
