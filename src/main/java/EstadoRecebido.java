public class EstadoRecebido implements EstadoEntrega {

    private static final EstadoRecebido instance = new EstadoRecebido();

    private EstadoRecebido() {}

    public static EstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebido";
    }
}