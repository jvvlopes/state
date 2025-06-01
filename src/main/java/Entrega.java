public class Entrega {

    private EstadoEntrega estado;

    public Entrega() {
        this.estado = EstadoRecebido.getInstance();
    }

    public void setEstado(EstadoEntrega estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado.getEstado();
    }
}
