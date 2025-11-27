package Animais;


public class Exotico extends Animal {

	private Perigoso perigoso;
	
	public Exotico(String n, int ano, String e, String h, String r, Perigoso perigoso) {
	    super(n, ano, e, h, r);
		 this.setPerigoso(perigoso);

	}
	
	public enum Perigoso{Sim, Nao};


	public Perigoso getPerigoso() {
		return perigoso;
	}

	public void setPerigoso(Perigoso perigoso) {
		this.perigoso = perigoso;
	}
}
