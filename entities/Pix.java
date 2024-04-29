package entities;

public class Pix implements Payment{

	@Override
	public void pay() {
		System.out.println("Pagando com Pix");
	}

}
