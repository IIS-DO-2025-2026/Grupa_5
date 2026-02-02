package abstractFactory;

import simpleFactory.Bill;

public class HousecleaningBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Hosecleaning bill has been paid.");

	}

}
