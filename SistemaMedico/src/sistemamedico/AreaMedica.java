package sistemamedico;

/**
 *
 * @author eli
 */

public class AreaMedica {

    protected String especialidad;
    protected float costo;
    protected Doctor_a doctores;

    public AreaMedica(String especialidad, float costo) {
        this.especialidad = especialidad;
        this.costo = costo;
    }

}