package entities.factory;

import entities.Card;
import entities.Payment;

public class CardFactory implements PaymentFactory {

	@Override
	public Payment createPayment() {
		return new Card();
	}

}
