package entities;

public class Paypal implements Payment{
	@Override
	public void pay() {
		System.out.println("Pagando com Paypal");
	}

}
