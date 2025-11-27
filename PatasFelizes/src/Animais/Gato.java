package Animais;

public class Gato extends Animal{
private TesteFelv testeFelv;


public Gato(String n, int ano, String e, String h, String r, TesteFelv testeFelv) {
    super(n, ano, e, h, r);
	 this.setTesteFelv(testeFelv);

}
	

public TesteFelv getTesteFelv() {
	return testeFelv;
}


public void setTesteFelv(TesteFelv testeFelv) {
	this.testeFelv = testeFelv;
}


public enum TesteFelv {Positivo, Negativo};
}
