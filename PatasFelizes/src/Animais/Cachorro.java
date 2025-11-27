package Animais;

import Animais.Gato.TesteFelv;

public class Cachorro extends Animal{

	private NivelAdestramento nivelAdestramento;
	
	public Cachorro (String n, int ano, String e, String h, String r, NivelAdestramento nivelAdestramento) {
		super(n, ano, e, h, r);
		this.setNivelAdestramento(nivelAdestramento);
	}
	
	
	public NivelAdestramento getNivelAdestramento() {
		return nivelAdestramento;
	}


	public void setNivelAdestramento(NivelAdestramento nivelAdestramento) {
		this.nivelAdestramento = nivelAdestramento;
	}


	public enum NivelAdestramento {Basico, Intermediario, Avancado};
}
