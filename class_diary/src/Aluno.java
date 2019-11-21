public class Aluno {
	private String nome, matricula;
	private int quantidade_falta;
	private boolean aprovado;

	public Aluno(){}

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public void setQuantidade_falta(int quantidade_falta) {
		this.quantidade_falta = quantidade_falta;
	}

	public int getQuantidade_falta() {
		return quantidade_falta;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

}
