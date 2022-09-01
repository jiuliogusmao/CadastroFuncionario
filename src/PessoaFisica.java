
public class PessoaFisica extends Pessoa {
	private String cpf;
	
	
	public PessoaFisica(String nome, int codigo, String cpf) {
		super(nome, codigo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
