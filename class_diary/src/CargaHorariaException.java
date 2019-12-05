public class CargaHorariaException  extends Exception{
    @Override
    public String getMessage() {
        return "Valor inválido para carga horaria";
    }
}
