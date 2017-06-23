package com.pronet.components.bitoperated;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import com.pronet.model.Bit;

/**
 * Created by prith on 20-06-2017.
 */
public class AndGateTest {
    @Test public void testSet() {
        And and = new And();
        Bit[] tf = { new Bit(true),new Bit(false)};
        and.set(tf);
        assertFalse(and.read().read());
        Bit[] ft = { new Bit(true),new Bit(false)};
        and.set(ft);
        assertFalse(and.read().read());
        Bit[] tt = { new Bit(true),new Bit(true)};
        and.set(tt);
        assertTrue(and.read().read());

    }
}
