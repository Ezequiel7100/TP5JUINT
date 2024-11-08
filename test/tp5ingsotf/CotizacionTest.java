/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5ingsotf;

import org.junit.Test;
import static org.junit.Assert.*;

public class CotizacionTest {
    private Conversor conversor = new Conversor();

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        System.out.println("cotizarCero");
        double montoEnOtraMoneda = 0.0;
        double montoLocal = 0.0;
        conversor.cotizacion(montoEnOtraMoneda, montoLocal);  
    }
}
