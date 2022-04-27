package Prova1;

public class Sofa {
	private String cor;
	private int lugares;
	private float preco;
	
	//construtor
	public Sofa(String cor, int lugares, float preco) {
		super();
		this.cor = cor;
		this.lugares = lugares;
		this.preco = preco;
	}

	//metodos de acesso
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getLugares() {
		return lugares;
	}


	public void setLugares(int lugares) {
		this.lugares = lugares;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//metodos
	public void reclinar()
	{
		System.out.println("reclinado\n");
	}
	public void recolher()
	{
		System.out.println("recolhido");
	}
}
