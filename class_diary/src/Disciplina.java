import java.util.ArrayList;
import java.util.Scanner;
public class Disciplina {
    private String nome;
    private int carga_horaria, VA;
    private ArrayList<Aluno> lista_alunos = new ArrayList<>();

    public Disciplina(){}

    public Disciplina(String nome, int carga_horaria){
        this.nome = nome;
        this.carga_horaria = carga_horaria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
        if(carga_horaria == 30){
            VA = 2;
        }
        else if(carga_horaria >= 40 && carga_horaria < 50){
            VA = 3;
        }
        else if(carga_horaria >= 60){
            VA = 4;
        }
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void cadastraAlunos(Aluno a){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        a.setNome(input.next());
        System.out.println("Matricula: ");
        a.setMatricula(input.next());
        System.out.print("Quantidade de faltas: ");
        a.setQuantidade_falta(input.nextInt());
        for(int i = 0; i < VA; i++){
            System.out.println("Digite a nota da "+(i+1)+"avaliacao");
            a.setNota(input.nextFloat());
        }
        lista_alunos.add(a);
    }

    public void addAlunos(int quantidade){

        System.out.println("Digite "+quantidade+" aluno(s)");
        for(int i = 0; i < quantidade; i++){
            int n = i + 1;
            System.out.println("Aluno " + n);
            Aluno a = new Aluno();
            cadastraAlunos(a);
        }
    }
    public void consultarAluno(Aluno a){
        System.out.prinln("a media do aluno "+ a.getNome() +" é :" + a.calculaMedia(VA));
    }

    public ArrayList<Aluno> getLista_alunos() {
        return lista_alunos;
    }

}
