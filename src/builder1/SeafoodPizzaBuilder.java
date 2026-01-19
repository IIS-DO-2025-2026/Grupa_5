package builder1;

public class SeafoodPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;
	
	public SeafoodPizzaBuilder() {
		pizza = new Pizza();
	}

	@Override
	public void putDough() {
		pizza.setDough("integralno");

	}

	@Override
	public void putSauce() {
		pizza.setSauce("paradajz sos");

	}

	@Override
	public void putCheese() {
		pizza.setCheese("gauda");

	}

	@Override
	public void putMeat() {
		pizza.setMeat("škampi");

	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
