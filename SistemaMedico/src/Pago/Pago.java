package Pago;

/**
 *
 * @author eli
 */

public interface Pago {

    /**
     * 
     * @param monto
     */
    boolean realizarPago(float monto);

    void operation();

}