package programapjepf;

public class PessoaJuridica extends Contribuinte {

	private Integer nFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (getnFuncionarios() <= 10) {
			imposto = getRendaAnual() * 16 / 100;
		} else {
			imposto = getRendaAnual() * 14 / 100;
		}
		return imposto;
	}

}
