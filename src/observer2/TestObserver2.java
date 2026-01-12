package observer2;

public class TestObserver2 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		UpdateSMS update1 = new UpdateSMS();
		
		cryptoCurrencyPrice.addObserver(update1);
		
		cryptoCurrencyPrice.setBitcoinPrice(200000);
		cryptoCurrencyPrice.setEtherPrice(25000);	}

}
