import java.util.Scanner;

public class Usa_diario {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        Disciplina d = new Disciplina();
        while(true){
            cadastrarDisciplina();
            System.out.println("deseja cadastrar um novo diario?");
            System.out.println("Sim - 1\nNao - 0");
            if(entrada.nextInt()==0)break;
            else continue;
        }
        while(true){
            ArrayList<Aluno> alunosn = d.getLista_alunos();
            System.out.println("Alunos cadastrados: ");
            for(int i = 0; i< alunosn.size(); i++){
                System.out.println(alunosn.get(i).getNome());
            }
            System.out.println("Informe a operacao desejada: \n");
        }
    }

    public static void cadastrarDisciplina(){
        Scanner input = new Scanner(System.in);
        int quantidade;
        System.out.print("Nome da Disciplina: ");
        d.setNome(input.next());

        System.out.print("Quantidade da Carga Horária da Disciplina de "+d.getNome() + ": ");
        d.setCarga_horaria(input.nextInt());

        System.out.print("Quantidade de alunos: ");
        quantidade = input.nextInt();

        d.addAlunos(quantidade);
    }
}
