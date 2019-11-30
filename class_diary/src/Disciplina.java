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
        a.setNome(input.nextLine());
        System.out.print("Matricula: ");
        a.setMatricula(input.next());
        System.out.print("Quantidade de faltas: ");
        a.setQuantidade_falta(input.nextInt());
        for(int i = 0; i < VA; i++){
            System.out.print("Digite a nota da "+(i+1)+" avaliacao: ");
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
        System.out.println("a media do aluno "+ a.getNome() +" é :" + a.calculaMedia(VA));
    }

    public ArrayList<Aluno> getLista_alunos() {
        return lista_alunos;
    }

    public void processaSituacaoDeAlunos(){
        for(Aluno al : lista_alunos){
           al.setMedia_parcial(al.calculaMedia(VA));

           if(al.getQuantidade_falta() > 0.25 * getCarga_horaria()){
               al.setAprovado(false);
               al.setReprovadoPorfalta(true);
               return;
           }

           if(al.getMedia_parcial() >= 7.0){
               al.setAprovado(true);
           }
           else if(al.getMedia_parcial() < 4.0){
               al.setAprovado(false);
           }
           else{
               al.setAprovado(processaFinalAluno(al));
           }
        }
    }
    private boolean processaFinalAluno(Aluno al){
        System.out.println();
        System.out.println("----Nota do aluno para conseguir a aprovação é " + (50 - al.getMedia_parcial()*6) / 4 + "----");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Insira nota da avaliação final para o aluno(a) " + al.getNome()+": ");
        double nota = input.nextDouble();
        al.setAvaliacao_final(nota);
        double media_final = (al.getMedia_parcial() * 6 + al.getAvaliacao_final() * 4) / 10;
        al.setMedia_avaliacaFinal(media_final);
        al.setFoiFinal(true);
        if(al.getMedia_avaliacaFinal() < 5){
            return false;
        }
        else{
            return true;
        }
    }

    public void relatorioDisciplina(){
        for(Aluno i : lista_alunos){
            System.out.println(i.toString());
        }
    }
}
