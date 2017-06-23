package com.pronet.components.bitoperated;

import com.pronet.logic.LogicGate;
import com.pronet.model.Bit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
/**
 * Created by prith on 20-06-2017.
 */
public class InverterTest {

    @Test public void testInverter() {
        LogicGate gate = new Not();
        Bit[] input  = {new Bit(false)};
        gate.set(input);
        assertTrue(gate.read().read());
    }

    @Test public void testInverterFlip() {
        LogicGate gate = new Not();
        Bit[] input  = {new Bit(true)};
        gate.set(input);
        assertFalse(gate.read().read());
    }
}
