package sistemamedico;

import Pago.*;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 *
 * @author eli
 */

public class Cita {

    protected LocalDateTime fecha;
    protected String registradoPor;
    protected boolean pagada;
    protected Paciente paciente;
    protected Collection doctor;
    protected Secretaria_o secretaria;

    public Cita() {
            
    }

    /**
     * 
     * @param valor
     */
    public void realizarPago(Pago valor) {
    }

}