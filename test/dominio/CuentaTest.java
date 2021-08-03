/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cesar Osorio Universidad de las Fuerzas Armadas ESPE
 */
public class CuentaTest {
    
    public CuentaTest() {
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
     * Test of setCliente method, of class Cuenta.
     */
   
//64.5677  /64.8990 0
    
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double cantidad = 100;
        Cuenta instance = new Cuenta("a",20);
        instance.depositar(cantidad);
        double generado = instance.getSaldo();
        assertEquals(120, generado, 0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 10.0;
        Cuenta instance = new Cuenta("a",20);;
        instance.retirar(cantidad);
        assertEquals(10, instance.getSaldo(), 0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
    
}
