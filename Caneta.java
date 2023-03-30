package metodosEspeciais;

public class Caneta {
	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String m, String c, float p) { //Este é o método construtor
		this.setModelo(m); 
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
	}

	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getponta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("O modelo é: " + this.getModelo());
		System.out.println("Ponta: " + this.getponta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
		}

	
	
}
