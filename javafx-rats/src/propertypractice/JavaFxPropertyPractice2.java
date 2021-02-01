package propertypractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

class JavaFxPropertyPractice2 {

	@Test
	void enterTheArea1() {
		SimpleIntegerProperty i = new SimpleIntegerProperty(0);
		SimpleStringProperty s = new SimpleStringProperty("Lion");

		i.addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("i = " + newValue);
				s.set(i.getValue().toString());
			}
		});

		s.addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println("s = " + newValue);
				i.set(Integer.valueOf(s.getValue()));
			}
		});
		
		i.set(1);
		System.out.println();
		i.set(2);
		System.out.println();
		s.set("3");
		System.out.println();
		s.set("4");
		System.out.println();
		i.set(5);
		System.out.println();
	}

	@Test
	@Disabled
	void test3() {
		SimpleStringProperty a = new SimpleStringProperty("Three");
		System.out.println(a.get());
		a.addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println(oldValue + " - " + newValue + "...");
			}
		});
		a.set("Four");
		a.set("Five");
		a.set("Six");
	}

	@Test
	@Disabled
	void test2() {
		ReadOnlyBooleanProperty b1 = new ReadOnlyBooleanWrapper(true).getReadOnlyProperty();
		System.out.println(b1.get());
	}

	@Test
	@Disabled
	void test1() {
		SimpleIntegerProperty x = new SimpleIntegerProperty(3);
		System.out.println(x.get());
	}

}
