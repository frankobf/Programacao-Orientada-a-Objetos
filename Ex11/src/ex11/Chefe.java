package ex11;

public class Chefe extends Funcionario {
	private String departamento;

	public Chefe(String nome, int identidade, Data dnascimento, Data datadeAdmissao, int salario, String departamento) {
		super(nome, identidade, dnascimento, datadeAdmissao, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(this.getDepartamento());
		return dados.toString();
	}

}
