package entities.factory;

import entities.Payment;

public class PaypalFactory implements PaymentFactory {

	@Override
	public Payment createPayment() {
		return new entities.Paypal();
	}

}
