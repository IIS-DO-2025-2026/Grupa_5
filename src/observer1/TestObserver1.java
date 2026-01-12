package observer1;

public class TestObserver1 {

	public static void main(String[] args) {
		//Observable
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		//Observer
		UpdateSMS update1 = new UpdateSMS();
		price.addObserver(update1);
		
		price.setBitcoinPrice(10000);
		price.setEtherPrice(5000);

	}

}
