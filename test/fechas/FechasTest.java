/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duvbarte
 */
public class FechasTest {

    public FechasTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Caso 6.1: Datos de entrada: Fecha de hoy (Valor borde). Resultado
     * esperado (Salida): Se permite el ingreso de la transacción (mensaje de
     * éxito).
     *
     * @throws Exception
     */
    @Test
    public void testCaso6_1() throws Exception {
        System.out.println("Caso 6.1: Datos de entrada: Fecha de hoy (Valor borde). "
                + "Resultado esperado (Salida): Se permite el ingreso de la transacción (mensaje de éxito).");
        String fechaFactura = "2021-05-18";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 6.2: Datos de entrada: Fecha de hoy más un día (Fecha de mañana).
     * Resultado esperado (Salida): No se permite el ingreso de la transacción y
     * se muestra un mensaje de error.
     *
     * @throws Exception
     */
    @Test
    public void testCaso6_2() throws Exception {
        System.out.println("Caso 6.2: Datos de entrada: Fecha de hoy más un día (Fecha de mañana)."
                + "          Resultado esperado (Salida): No se permite el ingreso de la transacción y se muestra un mensaje de error.");
        String fechaFactura = "2021-05-19";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 6.3: Datos de entrada: Fecha del día de ayer. Resultado esperado
     * (Salida): Se permite el ingreso de la transacción (mensaje de éxito).
     *
     * @throws Exception
     */
    @Test
    public void testCaso6_3() throws Exception {
        System.out.println("Caso 6.3: Datos de entrada: Fecha del día de ayer. "
                + "         Resultado esperado (Salida): Se permite el ingreso de la transacción (mensaje de éxito).");
        String fechaFactura = "2021-05-17";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
