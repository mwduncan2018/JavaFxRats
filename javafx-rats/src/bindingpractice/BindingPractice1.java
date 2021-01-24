package bindingpractice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

class BindingPractice1 {
	@Test
	void doubleBindingDemo() {
		DoubleProperty myValue = new SimpleDoubleProperty(5.5d);
		DoubleBinding volumeBinding = new DoubleBinding() {
			{
				super.bind(myValue);
			}

			@Override
			protected double computeValue() {
				double result = myValue.get() * myValue.get();
				System.out.println("computeValue - " + result);
				return result;
			}
		};
		IntStream.range(2, 6).forEach(x -> {
			myValue.set(x);
			volumeBinding.get();
		});
	}

	@Test
	void unidirectionalBinding() {
		StringProperty lastName = new SimpleStringProperty();
		StringProperty surName = new SimpleStringProperty();
		surName.bind(lastName);
		lastName.set("Duncan");
		System.out.println("lastName - " + lastName.get() + "\nsurName - " + surName.get());
	}

	@Test
	void cannotSetBoundVariable() {
		StringProperty lastName = new SimpleStringProperty();
		StringProperty surName = new SimpleStringProperty();
		surName.bind(lastName);
		try {
			surName.set("Angone");
		} catch (Exception e) {
			System.out.println("An exception was thrown because a bound variable cannot be set!");
		}
	}

	@Test
	void bidirectionalBinding() {
		StringProperty varA = new SimpleStringProperty();
		StringProperty varB = new SimpleStringProperty();
		varA.bindBidirectional(varB);
		varA.set("Maryland");
		System.out.println("varA - " + varA.get() + "\nvarB - " + varB.get());
		varB.set("Alabama");
		System.out.println("varA - " + varA.get() + "\nvarB - " + varB.get());
	}

	@Test
	void bindingOneIntegerToOtherIntegers() {
		IntegerProperty subtotal = new SimpleIntegerProperty();
		IntegerProperty taxes = new SimpleIntegerProperty();
		IntegerProperty total = new SimpleIntegerProperty();
		subtotal.set(200);
		taxes.set(10);
		total.bind(Bindings.add(subtotal, taxes));
		System.out.println("subtotal - " + subtotal.get() + "\ntaxes - " + taxes.get() + "\ntotal - " + total.get());
	}

	@Test
	void numberBindingDemo() {
		IntegerProperty length = new SimpleIntegerProperty(5);
		IntegerProperty width = new SimpleIntegerProperty(6);
		IntegerProperty area = new SimpleIntegerProperty(0);
		area.bind(length.multiply(width));
		NumberBinding perimeter = length.add(width).multiply(2.0d);
		System.out.println("area - " + area.get() + "\nperimeter - " + perimeter.getValue());
	}
}
