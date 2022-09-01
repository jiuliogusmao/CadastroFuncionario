
public class FuncionarioComissionado extends Funcionario{
	private float totalVendidos = 0;
	private float percentualComissao;
	
	public FuncionarioComissionado(String nome, int codigo, String cpf, float qtdeHrsTrab, float valorHrTrab) {
		super(nome, codigo, cpf, qtdeHrsTrab, valorHrTrab);
		
	}
	
	
	public float getTotalVendidos() {
		return totalVendidos;
	}
	public void setTotalVendidos(float totalVendidos) {
		this.totalVendidos = totalVendidos;
	}
	public float getPercentualComissao() {
		return percentualComissao;
	}
	
	public void setPercentualComissao(float pc) {
		percentualComissao = totalVendidos + (pc/100 * totalVendidos);
	}
}
