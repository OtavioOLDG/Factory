package entities.factory;

import entities.Payment;
import entities.Pix;

public class PixFactory implements PaymentFactory {

	@Override
	public Payment createPayment() {
		return new Pix();
	}

}
