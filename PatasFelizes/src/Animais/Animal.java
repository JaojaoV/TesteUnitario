package Animais;

public class Animal {
	private String nome;
	private int anoNasc;
	private String especie;
	private String historico;
	private StatusAdocao status;
	private String raca;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	};
	
	public Animal(String n, int ano, String e, String h, String r) {
		this.setNome(n);
		this.setAnoNasc(ano);
		this.setEspecie(e);
		this.setHistorico(h);
		this.setRaca(r);
		this.setStatus(StatusAdocao.Procurando);
		
	}
	public StatusAdocao getStatus() {
		return status;
	}
	public void setStatus(StatusAdocao status) {
		this.status = status;
	}
	public enum StatusAdocao {Procurando, EmAndamento, Adotado}
}
