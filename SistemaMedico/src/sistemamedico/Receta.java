package sistemamedico;

/**
 *
 * @author eli
 */

import java.time.LocalDateTime;

public class Receta {

    protected LocalDateTime fecha;
    protected Doctor_a doctor;
    protected Paciente paciente;
    protected Medicamento medicamentos;

    public Receta(LocalDateTime fecha, Doctor_a doctor, Paciente paciente) {
        this.fecha = fecha;
        this.doctor = doctor;
        this.paciente = paciente;
        medicamentos = new Medicamento();
    }

    public Receta() {
        medicamentos = new Medicamento();
    }
    
    

}