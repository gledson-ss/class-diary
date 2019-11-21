<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

=======
>>>>>>> a396d25c6363e1d5bc52e3af801d231545ceb7f3
public class Disciplina {
    private String nome;
    private int carga_horaria, VA;
    private ArrayList<Aluno> lista_alunos = new ArrayList<>();

    public Disciplina(){}

    public Disciplina(String nome, int carga_horaria){
        this.nome = nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
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

    public ArrayList<Aluno> getLista_alunos() {
        return lista_alunos;
    }

}
