
public class Principal {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Joao", 1, "111.111.111-11", 40, 10);
		FuncionarioComissionado f2 = new FuncionarioComissionado("Jose", 2, "222.222.222-22", 20, 10);
		
		System.out.println("Nome: " + f1.getNome() + 
				"\nCodigo: " + f1.getCodigo() + 
				"\nCPF: " + f1.getCpf() + 
				"\nQuantidade de horas trabalhadas: " + f1.getQtdeHorasTrab());
		
		System.out.println("Nome: " + f2.getNome() + 
				"\nCodigo: " + f2.getCodigo() + 
				"\nCPF: " + f2.getCpf() + 
				"\nQuantidade de horas trabalhadas: " + f2.getQtdeHorasTrab());

		f2.setTotalVendidos(450);
		f2.setPercentualComissao(10);
		System.out.println("Total vendido: " + f2.getTotalVendidos());
		System.out.println("Total com comissão: " + f2.getPercentualComissao());
	}

}
