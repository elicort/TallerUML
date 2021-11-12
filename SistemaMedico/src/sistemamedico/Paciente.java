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

    public Paciente() {
        historiaClinica = new HistoriaClinica();
        recipe = new Receta();
    }

    public boolean solicitarCita() {
        return false;
    }

}