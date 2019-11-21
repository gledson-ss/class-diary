import java.util.Scanner;

public class Usa_diario {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int quantidade;
        Disciplina d = new Disciplina();
        System.out.print("Nome da Disciplina: ");
        d.setNome(input.next());

        System.out.print("Quantidade da Carga Horária da Disciplina de "+d.getNome() + ": ");
        d.setCarga_horaria(input.nextInt());

        System.out.print("Quantidade de alunos: ");
        quantidade = input.nextInt();

        d.addAlunos(quantidade);

    }
}
