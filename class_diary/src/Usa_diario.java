import java.util.ArrayList;
import java.util.Scanner;

public class Usa_diario {
    public static void main(String []args){

        Disciplina d = new Disciplina();

            Scanner entrada = new Scanner(System.in);

            cadastrarDisciplina(d);

            d.relatorioDisciplina();


    }

    public static void cadastrarDisciplina(Disciplina d){
        Scanner input = new Scanner(System.in);
        int quantidade;
        System.out.print("Nome da Disciplina: ");
        d.setNome(input.nextLine());

        System.out.print("Quantidade da Carga Horária da Disciplina de "+d.getNome() + ": ");
        d.setCarga_horaria(input.nextInt());

        System.out.print("Quantidade de alunos: ");
        quantidade = input.nextInt();

        d.addAlunos(quantidade);
        d.processaSituacaoDeAlunos();
    }
}
