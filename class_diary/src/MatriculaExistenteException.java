public class MatriculaExistenteException extends Exception{
    @Override
    public String getMessage() {
        return "Aluno(a) com matricula já cadastrado(a)";
    }
}
