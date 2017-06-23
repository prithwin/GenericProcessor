package com.pronet.components.bitoperated;

import com.pronet.components.connect.LogicGateCircuitComponent;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import com.pronet.model.Bit;

/**
 * Created by prith on 21-06-2017.
 */
public class NandGateTest {
    @Test public void testNandgate(){
        NandGate nandGate = new NandGate();
        Bit[] tf = {new Bit(true),new Bit(false)};
        nandGate.set(tf);
        assertTrue(nandGate.read()[0].read());

        Bit[] tt = {new Bit(true),new Bit(true)};
        nandGate.set(tt);
        assertFalse(nandGate.read()[0].read());

        Bit[] ff = {new Bit(false),new Bit(false)};
        nandGate.set(ff);
        assertTrue(nandGate.read()[0].read());
    }
}
