
public class preBig extends Plano {
	
	private double valorExcedente;
	private int franquia;
	
	public preBig(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		// TODO Auto-generated constructor stub
	}
	
	public void quantoDevo(){
		
		double valorAPagar = (getQtdDias() - franquia) * valorExcedente;
		setValorAPagar(valorAPagar);
	}
	
	
	
	
	
}
