
package tp5ingsotf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTest {
    
    private static Conversor conversor;
    
    @BeforeClass
    public static void setUpClass() {
        conversor = new Conversor();
        System.out.println("Bienvenido a ConversorTest");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @Test
    public void testConvertir() {
        System.out.println("convertir");
        double monto = 1000.0;
        double tasaCambio = 1.2;
        double expResult = 1200.0;
        double result = conversor.convertir(monto, tasaCambio);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testCotizacion() {
        System.out.println("cotizacion");
        double montoEnOtraMoneda = 1620.0;
        double montoLocal = 180000.0;
        double expResult = 0.009;
        double result = conversor.cotizacion(montoEnOtraMoneda, montoLocal);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testAumentarSaldo() {
        System.out.println("aumentarSaldo");
        double saldo = 500.0;
        double montoComprado = 100.0;
        double expResult = 600.0;
        double result = conversor.aumentarSaldo(saldo, montoComprado);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testRetirarDolarFisico() {
        System.out.println("retirarDolarFisico");
        double saldo = 2100.0;
        double montoARetirar = 1100.0;
        double expResult = 1000.0;
        double result = conversor.retirarDolarFisico(saldo, montoARetirar);
        assertEquals(expResult, result, 0.001);
    }
}
