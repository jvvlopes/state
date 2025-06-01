import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    @Test
    void estadoRecebido() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EstadoRecebido.getInstance());
        assertEquals("Recebido", entrega.getEstado());
    }

    @Test
    void estadoTransporte() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EstadoTransporte.getInstance());
        assertEquals("Em Transporte", entrega.getEstado());
    }

    @Test
    void estadoCancelado() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EstadoCancelado.getInstance());
        assertEquals("Cancelado", entrega.getEstado());
    }
}
