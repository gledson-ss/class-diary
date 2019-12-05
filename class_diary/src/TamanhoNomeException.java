public class TamanhoNomeException extends Exception{
    @Override
    public String getMessage() {
        return "Tamanho do nome nao pode ultrapassar 40 caracteres";
    }
}
