/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5ingsotf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DolaritosTest {
    
    private double montoEnOtraMoneda;
    private double montoLocal;
    private double expected;

    public DolaritosTest(double montoEnOtraMoneda, double montoLocal, double expected) {
        this.montoEnOtraMoneda = montoEnOtraMoneda;
        this.montoLocal = montoLocal;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            { 180000, 1500, 120.0 },
            { 120000, 0, Double.POSITIVE_INFINITY },
            { 100000, -900, -111.111 },
            { 1000, 1, 1000 }
        });
    }

    @Test
    public void testCotizacionParametrizado() {
        System.out.println("cotizacionParametrizado");
        Conversor conversor = new Conversor();
        double result = conversor.cotizacion(montoEnOtraMoneda, montoLocal);
        assertEquals(expected, result, 0.001);
    }
}