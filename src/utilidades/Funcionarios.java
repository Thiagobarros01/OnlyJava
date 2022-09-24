package utilidades;

public class Funcionarios {
	private int id;
	private String nome;
	private double salario;

	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentarSalario(double porcentagem) {
		this.salario += salario + porcentagem / 100.0;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return id + "," + nome + "," + salario;
	}
}
