package sistemamedico;

/**
 *
 * @author eli
 */

public class Doctor_a extends Persona {

    
    protected int regDoctor_a;
    protected String especialidad;
    protected Cita citasPendientes;
    protected Receta receta;
    protected Secretaria_o secretaria_o;
    protected AreaMedica areas;

    public Doctor_a(int regDoctor_a, String especialidad) {
        this.regDoctor_a = regDoctor_a;
        this.especialidad = especialidad;
    }
    
    public void recetar() {
        
    }

    public void agregarPlanNut() {

    }

    public void imprimirReceta() {

    }

    public void registrarSecretaria() {

    }

}