package entities;

public class Card implements Payment{
	@Override
	public void pay() {
		System.out.println("Pagando com Cartão");
	}

}
