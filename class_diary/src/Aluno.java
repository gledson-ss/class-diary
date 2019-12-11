import java.util.ArrayList;

public class Aluno {


	private String nome, matricula;
	private int quantidade_falta;
	private boolean aprovado, foiFinal, reprovadoPorfalta;
	private ArrayList<Float> notas = new ArrayList<>();
	private double media_parcial, media_final, media_avaliacaFinal, avaliacao_final;

	public boolean isReprovadoPorfalta() {
		return reprovadoPorfalta;
	}

	public void setReprovadoPorfalta(boolean reprovadoPorfalta) {
		this.reprovadoPorfalta = reprovadoPorfalta;
	}

	//init aluno
	public Aluno(){
		media_parcial = -1;
		media_final = -1;
		media_avaliacaFinal = -1;
		avaliacao_final = -1;
		foiFinal = false;
		aprovado = false;
		reprovadoPorfalta = false;
	}
	//overload
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		media_parcial = -1;
		media_final = -1;
		media_avaliacaFinal = -1;
		avaliacao_final = -1;
		foiFinal = false;
		aprovado = false;
	}

	public boolean isFoiFinal() {
		return foiFinal;
	}

	public void setFoiFinal(boolean foiFinal) {
		this.foiFinal = foiFinal;
	}

	public void setMedia_parcial(double media_parcial) {
		this.media_parcial = media_parcial;
	}

	public void setMedia_final(double media_final) {
		this.media_final = media_final;
	}

	public double getAvaliacao_final() {
		return avaliacao_final;
	}

	public void setAvaliacao_final(double avaliacao_final) {
		this.avaliacao_final = avaliacao_final;
	}

	public ArrayList<Float> getNotas() {
		return notas;
	}

	public double getMedia_parcial() {
		return media_parcial;
	}

	public double getMedia_final() {
		return media_final;
	}

	public double getMedia_avaliacaFinal() {
		return media_avaliacaFinal;
	}

	public void setMedia_parcial(float media_parcial) {
		this.media_parcial = media_parcial;
	}

	public void setMedia_final(float media_final) {
		this.media_final = media_final;
	}

	public void setMedia_avaliacaFinal(double media_avaliacaFinal) {
		this.media_avaliacaFinal = media_avaliacaFinal;
	}

	public void setNotas(ArrayList<Float> notas) {
		this.notas = notas;
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
		return media / VA;
	}

	@Override
	public String toString() {
		String resp = null;
		resp = "Nome: " + nome + " | Matricula: " + matricula + " | Media parcial: " + media_parcial + " | Quantidade de faltas: " + getQuantidade_falta() +"\n";
		resp += "Notas de avaliação: ";
		for(int i = 0; i < notas.size(); i++){
			resp += notas.get(i);
			if(i != notas.size()-1)resp += " | ";
		}
		resp += "\n";
		if(isReprovadoPorfalta()){
			resp += "Aluno(a) reprovado(a) por falta";
		}
		else if(isFoiFinal()){
			resp += "Nota na atividade final: "+getAvaliacao_final() + " | Media final: " + getMedia_avaliacaFinal() + "\n";
			if(isAprovado()){
				resp += "Aluno(a) aprovado(a)!";
			}
			else{
				resp += "Aluno(a) reprovado(a)!";
			}
		}
		else if(isAprovado()){
			resp += "Aluno(a) aprovado(a)!";
		}

		else if(!isAprovado()){
			resp += "Aluno(a) reprovado(a)!";
		}

		return resp;
	}
}
