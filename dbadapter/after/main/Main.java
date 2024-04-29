package dbadapter.after.main;

import entities.Payment;
import entities.factory.CardFactory;
import entities.factory.PaymentFactory;
import entities.factory.PaypalFactory;
import entities.factory.PixFactory;

public class Main {
	
	public static void main(String[] args) {
		PaymentFactory payf1 = new CardFactory();
		Payment pay1 = payf1.createPayment();
		PaymentFactory payf2 = new PaypalFactory();
		Payment pay2 = payf2.createPayment();
		PaymentFactory payf3 = new PixFactory();
		Payment pay3 = payf3.createPayment();
		
		
		pay1.pay();
		pay2.pay();
		pay3.pay();
	}

}
