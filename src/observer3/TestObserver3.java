package observer3;

public class TestObserver3 {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		UpdateSMS update1 = new UpdateSMS();
		price.addListener(update1);
		
		price.setBitcoinPrice(900000);
		price.setEtherPrice(450000);

	}

}
