
public class Plano {
	
	private String nome;
	private String cpf;
	private String telefone;
	private int qtdDias;
	private double valorAPagar;
	
	public Plano(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public double getValorAPagar() {
		return valorAPagar;
	}

	public void setValorAPagar(double valorAPagar) {
		this.valorAPagar = valorAPagar;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	

	
	

}
