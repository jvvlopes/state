public class EstadoTransporte implements EstadoEntrega {

    private static final EstadoTransporte instance = new EstadoTransporte();

    private EstadoTransporte() {}

    public static EstadoTransporte getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Transporte";
    }
}