import java.util.ArrayList;

public class Aluno {
	private String nome, matricula;
	private int quantidade_falta;
	private boolean aprovado;
	private ArrayList<Float> notas = new ArrayList<>();

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
	public void setNota(float nota) {
		notas.add(nota);
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
	public float calculaMedia(int VA){
		float media = 0;
		for(int i = 0; i< notas.size(); i++){
			media+= notas.get(i);
		}
		return media/VA;
	}

}
