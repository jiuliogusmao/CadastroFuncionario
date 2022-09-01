
public class Funcionario extends PessoaFisica{
	private float qtdeHrsTrab = 0;
	private float valorHrTrab;
	
	public Funcionario(String nome, int codigo, String cpf, float qtdeHrsTrab, float valorHrTrab) {
		super(nome, codigo, cpf);
		this.qtdeHrsTrab = qtdeHrsTrab;
		this.valorHrTrab = valorHrTrab;
	}
	
	public float getQtdeHorasTrab() {
		return qtdeHrsTrab;
	}
	public void setQtdeHorasTrab(float qtdeHorasTrab) {
		this.qtdeHrsTrab = qtdeHorasTrab;
	}
	public float getValorRecebidoHrTrab() {
		return qtdeHrsTrab * valorHrTrab;
	}
	public void setValorRecebidoHrTrab(float valorRecebidoHrTrab) {
		this.valorHrTrab = valorRecebidoHrTrab;
	}
	
	
}
