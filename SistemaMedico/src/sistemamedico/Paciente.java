package sistemamedico;

/**
 *
 * @author eli
 */

public class Paciente extends Persona {

    protected String email;
    protected Cita cita;
    protected HistoriaClinica historiaClinica;
    protected Receta recipe;

    public Paciente(String email, Cita cita, HistoriaClinica historiaClinica) {
        this.email = email;
        this.cita = cita;
        historiaClinica = new HistoriaClinica();
        recipe = new Receta();
    }

    public boolean solicitarCita() {
        return false;
    }

}