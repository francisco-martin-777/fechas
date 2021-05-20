/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author duvbarte
 */
@RunWith(Parameterized.class)

public class ParamIT {
    private String fechaEntrada;
    private int resultadoEsperado;
    
    public ParamIT(String fechaEntrada, int resultadoEsperado) {
       this.fechaEntrada=fechaEntrada;
       this.resultadoEsperado=resultadoEsperado;
              
    }
    @Parameters
    public static Iterable<Object> getData() {
        List<Object> obj = new ArrayList<>();
        
        
        // Caso 6.1
        obj.add (new Object[] {"2021-05-18",0});
        // Caso 6.2:
        obj.add (new Object[] {"2021-05-19",1});
        // Caso 6.3:
        obj.add (new Object[] {"2021-05-17",-1}); 
        
        return obj;
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
     * test parametrzizado 
     */
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("test fecha correcta con el valor de entrada "+ fechaEntrada+ " el resultado esperado es "+resultadoEsperado);
        //String fechaFactura = "";     se borra pq no lo usaremos
        Fechas instance = new Fechas();
        //int expResult = 0; se elimina pq tampoco lo usarmeos
        int result = instance.esFacturaCorrectaEnFecha(fechaEntrada);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
