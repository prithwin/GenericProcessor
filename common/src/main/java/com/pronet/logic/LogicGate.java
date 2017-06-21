package com.pronet.logic;

import com.pronet.model.Bit;

/**
 * Represents the basic inteface of a logic gate.
 * any logic gate should basically let you set values and read values
 * from output
 */
public interface LogicGate {
    Bit TRUE = new Bit(true);
    Bit FALSE = new Bit(false);

    void set(Bit[] input);
    boolean readRaw();
    int getInputSize();
    int getOutputSize();

    default Bit read() {
        if(readRaw()) return TRUE;
        return FALSE;
    }
}
