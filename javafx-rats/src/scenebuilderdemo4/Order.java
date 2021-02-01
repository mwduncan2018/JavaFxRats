package scenebuilderdemo4;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Order {
	public enum Product {
		TRIPLE_BURGER, DOUBLE_BURGER, SINGLE_BURGER, CHICKEN_SANDWICH, TACO_SALAD
	}

	public enum MealDeal {
		LARGE_SODA_AND_FRIES, MEDIUM_SODA_AND_FRIES, SANDWICH_ONLY
	}

	private SimpleStringProperty customerName;
	private SimpleStringProperty customerDescription;
	private SimpleStringProperty product;
	private SimpleStringProperty mealDeal;
	private SimpleIntegerProperty percentComplete;

	public SimpleStringProperty getCustomerName() {
		return customerName;
	}
	public void setCustomerName(SimpleStringProperty customerName) {
		this.customerName = customerName;
	}
	
	public SimpleStringProperty getCustomerDescription() {
		return customerDescription;
	}
	public void setCustomerDescription(SimpleStringProperty customerDescription) {
		this.customerDescription = customerDescription;
	}
	public SimpleStringProperty getProduct() {
		return product;
	}
	public void setProduct(SimpleStringProperty product) {
		this.product = product;
	}
	public SimpleStringProperty getMealDeal() {
		return mealDeal;
	}
	public void setMealDeal(SimpleStringProperty mealDeal) {
		this.mealDeal = mealDeal;
	}
	public SimpleIntegerProperty getPercentComplete() {
		return percentComplete;
	}
	public void setPercentComplete(SimpleIntegerProperty percentComplete) {
		this.percentComplete = percentComplete;
	}

	public Order() {
	}
	
	public Order(String customerName, String customerDescription, String product, String mealDeal, Integer percentComplete) {
		this.customerName = new SimpleStringProperty(customerName);
		this.customerDescription = new SimpleStringProperty(customerDescription);
		this.percentComplete = new SimpleIntegerProperty(percentComplete);
		this.product = new SimpleStringProperty(product);
		this.mealDeal = new SimpleStringProperty(mealDeal);
	}	
}