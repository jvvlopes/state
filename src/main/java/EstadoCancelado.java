public class EstadoCancelado implements EstadoEntrega {

    private static final EstadoCancelado instance = new EstadoCancelado();

    private EstadoCancelado() {}

    public static EstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}
