/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author hcadavid
 */
public class PiCalcTest {

    public PiCalcTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void piGenTest() throws Exception {

        byte[] expected = new byte[]{
            0x2, 0x4, 0x3, 0xF, 0x6, 0xA, 0x8, 0x8,
            0x8, 0x5, 0xA, 0x3, 0x0, 0x8, 0xD, 0x3,
            0x1, 0x3, 0x1, 0x9, 0x8, 0xA, 0x2, 0xE,
            0x0, 0x3, 0x7, 0x0, 0x7, 0x3, 0x4, 0x4,
            0xA, 0x4, 0x0, 0x9, 0x3, 0x8, 0x2, 0x2,
            0x2, 0x9, 0x9, 0xF, 0x3, 0x1, 0xD, 0x0,
            0x0, 0x8, 0x2, 0xE, 0xF, 0xA, 0x9, 0x8,
            0xE, 0xC, 0x4, 0xE, 0x6, 0xC, 0x8, 0x9,
            0x4, 0x5, 0x2, 0x8, 0x2, 0x1, 0xE, 0x6,
            0x3, 0x8, 0xD, 0x0, 0x1, 0x3, 0x7, 0x7,};

        for (int start = 0; start < expected.length; start++) {
            for (int count = 0; count < expected.length - start; count++) {
                byte[] digits = PiDigits.getDigits(start, count);
                assertEquals(count, digits.length);

                for (int i = 0; i < digits.length; i++) {
                    assertEquals(expected[start + i], digits[i]);
                }
            }
        }
    }
    
    @Test
    public void unHiloTest() {
    	
    	BBPmain bbp = new BBPmain();
    	BBPmain bbp2 = new BBPmain();
    	bbp.calcularNumero(1);
    	bbp2.calcularNumero(1);
    	assertEquals(bbp.getSolu(),bbp2.getSolu());
    }
    
    @Test
    public void dosHilosTest() {
    	BBPmain bbp = new BBPmain();
    	BBPmain bbp2 = new BBPmain();
    	bbp.calcularNumero(1);
    	bbp2.calcularNumero(2);
    	assertEquals(bbp.getSolu(),bbp2.getSolu());
    }
    @Test
    public void tresHilosTest() {
    	BBPmain bbp = new BBPmain();
    	BBPmain bbp2 = new BBPmain();
    	bbp.calcularNumero(1);
    	bbp2.calcularNumero(3);
    	assertEquals(bbp.getSolu(),bbp2.getSolu());
    }
}
