package Pago;

/**
 *
 * @author eli
 */

package Pago;

import java.util.Date;

public abstract class PagoTarjeta implements Pago {

    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;
    
}