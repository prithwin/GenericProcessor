package com.pronet.components.bitoperated;

import com.pronet.model.Bit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by prith on 21-06-2017.
 */
public class NorGateTest {
    @Test public void testNorgate(){
        NorGate norGate = new NorGate();
        Bit[] tf = {new Bit(true),new Bit(false)};
        norGate.set(tf);
        assertFalse(norGate.read()[0].read());

        Bit[] tt = {new Bit(true),new Bit(true)};
        norGate.set(tt);
        assertFalse(norGate.read()[0].read());

        Bit[] ff = {new Bit(false),new Bit(false)};
        norGate.set(ff);
        assertTrue(norGate.read()[0].read());
    }
}
