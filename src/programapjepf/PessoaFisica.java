package programapjepf;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if (getRendaAnual() <= 20000) {
			imposto = getRendaAnual() * 15 / 100;
			if (getGastosSaude() > 0) {
				imposto = imposto - (getGastosSaude() * 50 / 100);
			}
		} else {
			if (getRendaAnual() > 20000) {
				imposto = getRendaAnual() * 25 / 100;
				if (getGastosSaude() > 0) {
					imposto = imposto - (getGastosSaude() * 50 / 100);
				}
			}
		}
		return imposto;
	}
}