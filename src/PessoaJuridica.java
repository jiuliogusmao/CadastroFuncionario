
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	
	PessoaJuridica(String nome, int codigo, String cnpj){
		super(nome, codigo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
